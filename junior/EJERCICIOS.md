# Ejercicios ANTLR en Junior

Requisitos: JDK 11 o superior y Maven. Ejecuta los comandos desde la carpeta `junior`, donde está `pom.xml`.

## Ejecutar los 12 árboles individuales y el conjunto

```sh
mvn clean compile exec:java
```

La salida contiene 13 árboles en notación parentizada: uno por ejercicio y uno con raíz `programa`. Cada entrada individual usa `individual: instruccion EOF`, para exigir que se consuma toda la entrada. El conjunto exige exactamente 12 instrucciones de primer nivel. Se reportan errores tanto léxicos como sintácticos y la ejecución falla si hay alguno. Esto valida sintaxis; no calcula resultados ni ejecuta el if.

## Probar un solo archivo

```sh
mvn compile exec:java -Dexec.args="src/test/resources/ejercicios/12.jr"
```

## Ejecutar el programa original

```sh
mvn compile exec:java -Dexec.mainClass=com.junior.Main
```

Se conserva `src/test/resources/test.jr` con `hello world`.

## Guardar evidencia textual

```sh
mvn -q compile exec:java > evidencia-arboles.txt
```

Para ver un árbol gráfico en la extensión ANTLR de VS Code, abre `src/main/antlr4/com/junior/Ejercicios.g4` y utiliza la vista de árbol que ofrezca tu extensión. Selecciona como entrada `src/test/resources/ejercicios/programa.jr` y regla inicial `programa`; para un ejercicio selecciona `01.jr` a `12.jr` y regla `individual`. Los nombres de los comandos de vista dependen de la extensión instalada. El ejecutor Java imprime texto, no abre una ventana gráfica.

## Organización y conflictos

- `Junior.g4`, `Main.java` y `JuniorCustomVisitor.java` conservan el lenguaje principal.
- `Ejercicios.g4` es una gramática combinada: incluye parser y lexer en un solo archivo. No pegues aquí los encabezados `parser grammar ExprParser` ni `lexer grammar ExprLexer`.
- Maven genera `JuniorLexer/JuniorParser` y `EjerciciosLexer/EjerciciosParser` en `target/generated-sources/antlr4`. Sus nombres son diferentes, por lo que no colisionan.
- El paquete `com.junior` se obtiene de la ruta `src/main/antlr4/com/junior`. No agregues un `@header` con otro `package`.
- No copies los Java generados a `src/main/java`; evita que la extensión genere duplicados allí. Maven es el encargado de generar y compilar.
- Se conserva ANTLR 4.9.2 en el plugin y runtime. Si cambias la versión, cambia ambos mediante `antlr4.version`.
- Maven tiene generación de visitors, compilador configurado para Java 11 y ejecución predeterminada de `com.junior.EjerciciosMain`.

Se conserva la gramática de la conversación, con puntos y coma opcionales y saltos de línea ignorados. Por tanto, acepta también algunas instrucciones consecutivas sin separador. Esto reproduce la actividad; no define todavía una política estricta de separadores para el lenguaje Junior.

El ejercicio 4 se toma como `10+valor*4`, conforme a la conversación previa. Los identificadores distinguen mayúsculas y minúsculas.
