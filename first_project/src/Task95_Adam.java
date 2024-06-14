import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.StandardOpenOption;
        import java.util.ArrayList;
        import java.util.List;

public class Task95_Adam {

    public static void main(String[] args) {
        List<String> beolvasottAdatok = getTriangleDataFromFile();

        for (String oldalak : beolvasottAdatok) {

            String[] rowArray = oldalak.split(",");
            int aoldal = Integer.parseInt(rowArray[0]);
            int boldal = Integer.parseInt(rowArray[1]);
            int coldal = Integer.parseInt(rowArray[2]);

            if ((aoldal + boldal) > coldal &&
                    (aoldal + coldal) > boldal &&
                    (boldal + coldal) > aoldal) {
                System.out.println("Szerkeszthető");

                triangleResult("Szerkeszthető" + System.lineSeparator());
            } else {
                System.out.println("Nem szerkeszthető" );
                triangleResult("Nem szerkeszthető" + System.lineSeparator());
            }
        }
    }

    public static List<String> getTriangleDataFromFile() {
        List<String> validTriangle = new ArrayList<>();

        try {
            validTriangle = Files.readAllLines(Path.of("src/resources/triangleExample.txt"));

        } catch (IOException e) {
            System.out.println("Nem tudom beolvasni" + e.getMessage());
        }
        return validTriangle;
    }

    public static void triangleResult(String content){

        try {
            Files.writeString(Path.of("src/resources/triangleResult.log"), content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Nem tudom menteni a fájlt" + e.getMessage());
        }
    }
}














