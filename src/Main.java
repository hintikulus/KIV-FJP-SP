import compilator.Compilator;
import compilator.enums.EErrorCode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String[] args) {

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
            System.out.println("File not found " + input);
            System.exit(EErrorCode.ERROR_LOADING_INPUT_FILE.getCode());
        }

        Compilator.getInstance().run(inputStream, output);

        System.out.println("Done");

    }

    public static void printUse()
    {
        System.out.println("Invalid input arguments.");
        System.out.println("Use:");
        System.out.println("java -jar Delej.jar <input file> <output file>");
    }
}