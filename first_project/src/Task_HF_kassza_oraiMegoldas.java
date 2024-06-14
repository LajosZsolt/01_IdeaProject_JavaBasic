// Sajnos extra feladatok még nem készültek el.

import java.util.HashMap;
import java.util.Scanner;
//A terminálnak különböző termékek neveit lehet megadni(minimum 6) melyeknek saját áruk van.
//Ha a felhasználó nem létező terméket ad meg, figyelmeztesse erre.
//A terminál egy speciális input segítségével lezárja a vásárlást és kiírja a fizetendő összeget.
//Egy másik speciális inputra pedig lenullázza azt vásárlás közben.
//Az implementáció során használj switch-case utasítást és kommentben a kód elején jelöld meg mely extra feladatokat készítetted el, ha van ilyen
//A kassza írja ki az utasításkészletét az induláskor és ha lehet közben is tájékoztassa megfelelően a usert arról hogy mi történik :)
//Extra feladatok (nem muszáj sorban, lehet válogatni is):
//0) Lehessen megadni darabszámot a termék neve után (először megkérdezi a termék nevét, majd a mennyiséget külön olvassa be)
//1) Lehessen terméket 'szotornózni', azaz egy speciális inputra az ELŐZŐ termék árát vonja le a vásárlásból.
//2) A kassza folyamatosan üzemeljen, azaz ha egy vásárlás lezárult kérdezze meg akarunk-e újat indítani (jön-e következő vásárló, vagy zárjuk a kasszát)
//3) Kassza záráskor írja ki mennyi volt az össz bevétel
//4) Vásárlás közben ha megadtuk az összes terméket, megadhatjuk mennyi pénzt adott a vásárló és kiírjuk a visszajáró összegét
//5) switch-case helyett használj if, else if, else utasításokat és lehetőleg ügyelj rá hogy fölöslegesen ne ellenőrizz inputokat :)

public class Task_HF_kassza_oraiMegoldas {
    public static void main(String[] args) {

        HashMap<String, Integer> items = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        items.put("Kenyér", 450);
        items.put("Tej", 400);
        items.put("Vaj", 1200);
        items.put("Méz", 2000);
        items.put("Kifli", 60);

        System.out.println("Kenyér: " + items.get("Kenyér") + "Ft");
        System.out.println("Tej: " + items.get("Tej") + "Ft");
        System.out.println("Vaj: " + items.get("Vaj") + "Ft");
        System.out.println("Méz: " + items.get("Méz") + "Ft");
        System.out.println("Kifli: " + items.get("Kifli") + "Ft");

//
//        while (nextCustomer);
//        boolean nextCustomer = true;
//        int price = 0;
//        int latesPrice = 0;
//
//



    }
}


