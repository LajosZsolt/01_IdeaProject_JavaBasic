import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWritingAndReading_IO {

    public static void main(String[] args) {
        try {
            String content = "Hello. This is the Third One" + System.lineSeparator() + "This is great. " + System.lineSeparator()
                    + "I could create a file from java." + "We are exercise the JAVA IO! this is a great feature!";
            Files.writeString(Paths.get("src/resources/my-new-file.txt"), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            List<String> lines = Files.readAllLines(Paths.get("src/resources/trainings.csv"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            List<String> fileContentList = Files.readAllLines(Paths.get("src/resources/my-new-file.txt"));
              for (String line : fileContentList) {
                System.out.println(line);
                  }
            System.out.println(fileContentList.size());
            System.out.println(fileContentList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
