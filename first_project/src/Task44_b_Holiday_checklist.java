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

public class Task44_b_Holiday_checklist {
    public static void main(String[] args) {
        System.out.println("Holiday checklist :) !");
        Scanner scanner = new Scanner(System.in);
        List<String> holidayCheckList = new ArrayList<>();
        List<String> holidayFinalCheckList = new ArrayList<>();

        boolean contList = true;

        while (contList) {
            System.out.println("Add or remove your checklist item: (to stop press 'x')");
            System.out.println("Your list now: " + holidayFinalCheckList);
            String userInput = scanner.nextLine();
            if (userInput.equals("x")) {
                contList = false;
            } else if (holidayCheckList.contains(userInput)) {
                holidayFinalCheckList.remove(userInput);
                System.out.println("This task is done, removed from the list!");
            } else {
                holidayCheckList.add(userInput);
                holidayFinalCheckList.add(userInput);
            }

            if (holidayFinalCheckList.isEmpty()) {
                    System.out.println("Your list is empty, let's go Holiday!");
                    contList = false;
                }
            }
        System.out.println("Your original tasks: " + holidayCheckList);
        System.out.println("Not finished tasks: " + holidayFinalCheckList);
        }

    }

