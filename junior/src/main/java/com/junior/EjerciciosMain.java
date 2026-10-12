package com.junior;

import java.nio.file.Path;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/** Valida sintaxis e imprime árboles; no evalúa las expresiones. */
public class EjerciciosMain {
    private static final Path BASE = Path.of("src/test/resources/ejercicios");

    private static class Errores extends BaseErrorListener {
        int cantidad;
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object simbolo,
                int linea, int columna, String mensaje, RecognitionException causa) {
            cantidad++;
            System.err.printf("Línea %d:%d %s%n", linea, columna, mensaje);
        }
    }

    private static void analizar(Path archivo, boolean conjunto) throws Exception {
        Errores errores = new Errores();
        EjerciciosLexer lexer = new EjerciciosLexer(CharStreams.fromPath(archivo));
        lexer.removeErrorListeners();
        lexer.addErrorListener(errores);
        EjerciciosParser parser = new EjerciciosParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errores);
        ParseTree tree = conjunto ? parser.programa() : parser.individual();
        if (errores.cantidad > 0) {
            throw new IllegalArgumentException("Entrada inválida: " + archivo);
        }
        if (conjunto && ((EjerciciosParser.ProgramaContext) tree).instruccion().size() != 12) {
            throw new IllegalArgumentException("Se esperaban 12 instrucciones en " + archivo);
        }
        System.out.println("\n=== " + archivo.getFileName() + " — válido ===");
        System.out.println(tree.toStringTree(parser));
    }

    public static void main(String[] args) throws Exception {
        if (args.length > 1) {
            throw new IllegalArgumentException("Uso: EjerciciosMain [archivo-individual.jr]");
        }
        if (args.length == 1) {
            analizar(Path.of(args[0]), false);
            return;
        }
        for (int i = 1; i <= 12; i++) {
            analizar(BASE.resolve(String.format("%02d.jr", i)), false);
        }
        analizar(BASE.resolve("programa.jr"), true);
    }
}
