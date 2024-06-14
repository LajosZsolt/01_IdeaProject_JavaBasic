import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task75_RunningTestResult_01 {
//Készítsetek teszteset futási összesítő alkalmazást.
// A futási eredmények az alábbi formában tároljuk le egy ArrayList-ben
// vagy konzolról beolvasva kapjuk. Minden teszteset futás kezdődik egy
// 4 számjegyű számmal, majd egy 1-es ha PASS, X ha SKIP, valamint 0 ha FAILED.
// Egy példa adat tehát: 00171 A feladat, hogy számoljuk össze
//a-Összesen hány teszteset került futtatásra?
//b-Mennyi volt PASS? SKIP? FAILED?
//c-Jelenítsük meg az adatokat százalékos formában is

    public static void main(String[] args) {
        List<String> testruns = Arrays.asList("0017X", "0018X", "00870", "12450", "5555X", "12341", "54321", "55551", "00001");
        List<String> results = new ArrayList<>();
        int pass = 0;
        int skip = 0;
        int failed = 0;

        for (int i = 0; i < testruns.size(); i++) {
            String testrun = testruns.get(i);
            String testResult = testrun.substring(4);
            switch (testResult) {
                case "1" -> {
                    results.add("PASS");
                    pass++;
                }
                case "X" -> {
                    results.add("SKIP");
                    skip++;
                }
                case "0" -> {
                    results.add("FAILED");
                    failed++;
                }
                default -> System.out.println("Incorrect execution result!");
            }
        }
        System.out.println(results);
        System.out.println("Number of tests= " + ( pass + skip + failed) );
        System.out.print("Number of pass= " + pass);
        System.out.println (" - Rate of pass: " + (((double) pass / (double) ( pass + skip + failed))*100) + " %");
        System.out.print("Number of skip= " + skip);
        System.out.println (" - Rate of pass: " + (((double) skip / (double) ( pass + skip + failed))*100) + " %");
        System.out.print("Number of failed= " + failed);
        System.out.println (" - Rate of pass: " + (((double) failed / (double) ( pass + skip + failed))*100) + " %");



    }
}