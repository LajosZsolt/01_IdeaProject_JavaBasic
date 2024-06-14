package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task95_Triangle_IO_SzilagyiSz {

    public static void main(String[] args) {
        List<String> triangles = getListFromText();
        String result = "";
        for (String lines : triangles) {
            String[] rowArray = lines.split(",");
            try {
                double aSide = Double.parseDouble(rowArray[0]);
                double bSide = Double.parseDouble(rowArray[1]);
                double cSide = Double.parseDouble(rowArray[2]);
                result += getResult(aSide, bSide, cSide);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Nem megfelelő mennyiségű adat");
            }catch (NumberFormatException e){
                System.out.println("Helytelen adattípus.");
            }

        }
        reultsOfFile(result);
    }

    public static List<String> getListFromText() {
        List<String> fileList = new ArrayList<>();
        try {
            fileList = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileList;
    }
    public static void reultsOfFile(String results){
        try {
            Files.writeString(Paths.get("src/resources/triangleResult.log"), results);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getResult(double a, double b, double c){
        String result = "";
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("negativ vagy nem létező oldal");
            result += "negativ vagy nem létező oldal" + System.lineSeparator();
        } else if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("ez valóban egy háromszög");
            result += "ez valóban egy háromszög" + System.lineSeparator();
        } else {
            System.out.println("ez nem egy háromszög");
            result += "ez nem egy háromszög" + System.lineSeparator();
        }return result;
    }

}
