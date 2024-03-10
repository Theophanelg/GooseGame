# TP8 JAVA

## Objectif of the TP 7

```bash
  Implementation of a goose game 
```

## Realize

- Not Finished, Test was fonctionnal
- What class was finish actually : Board, Player, Cell, ClassicalBoard
- Methode need to finish : Play() of Game class

## Compilation

```bash
  - Compilation of the test classe
  javac -classpath junit-console.jar:classes test/goosegame/*.java
  - Compilation of the goosegame classe
  javac -cp src src/goosegame/*.java -d classes
  javac -cp src src/goosegame/cell/*.java -d classes
  javac -cp src src/goosegame/board/*.java -d classes
```

## Execution

```bash
  java -jar junit-console.jar -classpath test:classes -scan-classpath 
  - Execution of classe goosegame.Main
  java -classpath classes goosegame.Main
```

## Docs 

```bash
  javadoc -sourcepath src -subpackages goosegame -d docs
```
## Authors

- [theophane.legrand.etu@univ-lille.fr](mailto:theophane.legrand.etu@univ-lille.fr)


