import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Task89_backupOfArguments {
    /**
     * Írjunk egy alkalmazást, amely biztonsági mentést készít a használt Program arguments-ekről.
     * Ehhez készítsünk egy metódust, amely elvégzi a fájlba írást nekünk.
     * A fájl neve legye used_arguments.txt.
     */

    public static void main(String[] args) {
        saveArgumentsToFile(args);
    }

    public static void saveArgumentsToFile(String[] usedArgsArray) {
        writeToFile("", false);
        for (int i = 0; i < usedArgsArray.length; i++) {
            writeToFile(usedArgsArray[i] + " ", true);
        }

    }


    public static void writeToFile(String content, boolean append) {
        try {
            if (append) // append == true
                Files.writeString(Paths.get("src/resources/user_arguments.txt"), content, StandardOpenOption.APPEND);
            else
                Files.writeString(Paths.get("src/resources/user_arguments.txt"), content);
        } catch (IOException e) {
            System.out.println("Something went wrong with the arguments saving." + e.getMessage()); //+ az exepction hibaüzetnet
        }
    }
}
