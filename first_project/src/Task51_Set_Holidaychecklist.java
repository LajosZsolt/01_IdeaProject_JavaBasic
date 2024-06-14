//
//Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni,
// hogy mik azok a tevékenységek, dolgok amiket a nyaralás elindulása előtt
// el kell intézni vagy el kell tenni, hogy minden meglegyen, rendben legyen.
// Ha ‘X’-et ír tevékenység helyett, akkor fejezze be az elemek hozzáadását.

import java.util.*;

public class Task51_Set_Holidaychecklist {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Set<String> holidayCheckList = new HashSet<>();
//        //Set<String> holidayFinalCheckList = new HashSet<>();
//
//        boolean contList = true;
//        while (contList) {
//            System.out.println("Add items to your holiday checklist: (to stop press 'x')");
//            System.out.println("Your list now: " + holidayCheckList);
//            String userInput = scanner.nextLine();
//            if (userInput.equals("x")) {
//                contList = false;
//            } else {
//                holidayCheckList.add(userInput);
//                //       holidayFinalCheckList.add(userInput);
//            }
//
//            //   if (holidayFinalCheckList.isEmpty()) {
//            //           System.out.println("Your list is empty, let's go Holiday!");
//            //           contList = false;
//            //       }
//        }
//        System.out.println("Your tasks: " + holidayCheckList);
//        // System.out.println("Not finished tasks: " + holidayFinalCheckList);
//    }

        // Ugyanez for ciklussal!

        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        Set<String> checklist = new HashSet<>();

        for (; !userInput.equals("x"); ) {
            System.out.println("Add your item (with for cycle1): ");
            userInput = scanner.nextLine();
            if (!userInput.equals("X"))
                checklist.add(userInput);
            System.out.println(checklist);
        }

        // for ciklussal - x-et nem adja hozzá a HashSet-hez
        String userInput2 = "";
        Set<String> checklist2 = new HashSet<>();

        for (; !userInput2.equals("x"); ) {
            System.out.println("Add your item (for cycle2): ");
            userInput2 = scanner.nextLine();
            if (!userInput2.equals("x"))
                checklist2.add(userInput2);
            System.out.println(checklist2);
        }
    }
}



