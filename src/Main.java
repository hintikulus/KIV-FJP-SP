import compilator.Compilator;
import compilator.enums.EErrorCode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {



    public static void main(String[] args) {

        printInfo();
        if (args.length != 2)
        {
            printUse();
            System.exit(EErrorCode.ERROR_INVALID_USE.getCode());
        }

        String input = args[0];
        String output = args[1];

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(input);

        } catch (Exception e) {
            System.out.println("Vstupni soubor nenalezen " + input);
            System.exit(EErrorCode.ERROR_LOADING_INPUT_FILE.getCode());
        }

        Compilator.getInstance().run(inputStream, output);

        System.out.println("Preklad dokoncen");

    }

    public static void printInfo(){
        System.out.println("Semestralni prace z predmetu KIV/FJP");
        System.out.println("Prekladac pro programovaci jazyk Delej");
        System.out.println("Autori: David Kuta, Jan Hinterholzinger");
    }

    public static void printUse()
    {
        System.out.println("Spatne pouziti programu.");
        System.out.println("Spoustejte prosim s nasjedujicimi parametry:");
        System.out.println("java -jar Delej.jar <vstupni soubor> <vystupni soubor>");
    }
}