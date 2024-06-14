package hu.progmatic;
//
//Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni, hogy mik azok a tevékenységek,
// dolgok amiket a nyaralás elindulása előtt el kell intézni vagy el kell tenni, hogy minden meglegyen,
// rendben legyen. Kérjük be a felhasználótól hány elemet
//        ügyeljetek rá, hogy kétszer ne lehessen ugyanazt az elemet a listához adni.
//        Ha mégis megpróbálja a felhasználó akkor kapjon hibaüzenetet.
//         amennyiben a felhasználó azt az elemet adja meg, ami már létezik a listában,
//        úgy akkor azt törölje onnan. (jelezve, hogy az a feladat/tevékenység teljesült)
//        amennyiben elfogyott minden elem a listáról, akkor írja ki a program, hogy
//        “Minden megvan, indulhat a nyaralás!”


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task44_a_Holiday_checklist {
    public static void main(String[] args) {
        System.out.println("Holiday checklist :) !");
        Scanner scanner = new Scanner(System.in);
        List<String> holidayCheckList = new ArrayList<>();
        boolean contList = true;

        while (contList) {
            System.out.println("Add your checklist item: (to stop press 'x')");
            String userInput = scanner.nextLine();
            if (userInput.equals("x")){
                contList = false;
            } else if (holidayCheckList.contains(userInput)) {
                System.out.println("This item already added!");
            } else {
                holidayCheckList.add(userInput);
            }

        }
        System.out.println("Your list is recorded, with " + holidayCheckList.size() + " items");
        for (int i = 0; (i < holidayCheckList.size()); i++) {
            System.out.println(holidayCheckList.get(i));
        }
    }
}
