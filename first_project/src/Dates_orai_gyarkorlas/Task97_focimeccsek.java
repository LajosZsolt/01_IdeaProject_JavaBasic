package Dates_orai_gyarkorlas;


import java.time.LocalDate;

//Órai) Szombaton focimeccs. Ebben a feladatban mi vagyunk a középiskolások
// focimeccseit összeállító vezető testület egyik tagja. Az a döntés született,
// hogy a bajnokság megnyitója 2023. január 11.-ére került, a bajnokság meccseire
// pedig ezt követően minden szombaton kerül sor az elkövetkezendő 12 hétben. A feladat,
// hogy írjunk egy programot, amit meghatározza milyen dátumokra esnek ezek a szombati napok.
// A dátumokat írjuk ki a konzolra.
public class Task97_focimeccsek {

    public static void main(String[] args) {
        LocalDate firstSaturday = LocalDate.of(2023, 1, 7);
        System.out.println(firstSaturday);

        int count = 0;
        LocalDate satruday = firstSaturday;
        System.out.println("Next 12 Saturdays in early 2023 :");
        while (count <= 12) {
            satruday = satruday.plusDays(7);
            System.out.println(satruday);
            count++;

        }


    }

}
