# KIV-FJP-SP
## Spouštění
java -jar Delej.jar <vstupní_soubor_s_programem> <výstupní_soubor_s_PL0_instrukcemi>

## Překlad
mvn clean – vyčistí cílovou složku Mavenu

mvn package – provede sestavení aplikace.

Výsledný .jar soubor se nachází v Maven adresáři target. Je nutnost spouštět soubor, s sufixem v názvu -with-dependencies, jelikož má v sobě zabalené ANTLR, které je potřeba pro chod programu. Soubor se spouští stejně jako výše.
