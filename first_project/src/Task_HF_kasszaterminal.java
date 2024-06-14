// Sajnos extra feladatok még nem készültek el.

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

public class Task_HF_kasszaterminal {
    public static void main(String[] args) {
        System.out.println("Pékárúk a Péktől!");
        boolean shoppingCont = true;
        int sumAmount = 0;
        System.out.println("Kifli :130Ft - Zsemle :100Ft - Stangli :200Ft - Croissant:250Ft - Sósperec: 300Ft - Burek: 900Ft");
        while (shoppingCont) {
            System.out.println("A vásárlói kosarának az értéke eddig: " + sumAmount + " -Ft");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Válasszon egy terméket a fentiek közül: ");
            String product = scanner.nextLine();

            if ((!product.equals("Kifli")) && (!product.equals("Zsemle")) && (!product.equals("Croissant")) &&
                    (!product.equals("Sósperec")) && (!product.equals("Burek")) && (!product.equals("Stangli"))) {
                System.out.println("Kérem a felsorolt termékekből válasszon!");
            } else {
                switch (product) {
                    case "Kifli":
                        System.out.println("Kiflit hozzáadtuk a kosárhoz");
                        sumAmount = sumAmount + 130;
                        break;
                    case "Zsemle":
                        System.out.println("Zsemlét hozzáadtuk a kosárhoz");
                        sumAmount = sumAmount + 100;
                        break;
                    case "Stangli":
                        System.out.println("Stanglit hozzáadtuk a kosárhoz");
                        sumAmount = sumAmount + 200;
                        break;
                    case "Croissant":
                        System.out.println("Croissant hozzáadtuk a kosárhoz");
                        sumAmount = sumAmount + 250;
                        break;
                    case "Sósperec":
                        System.out.println("Sósperecet hozzáadtuk a kosárhoz");
                        sumAmount = sumAmount + 300;
                        break;
                    case "Burek":
                        System.out.println("Bureket hozzáadtuk a kosárhoz");
                        sumAmount = sumAmount + 900;
                        break;
                }
            }
            System.out.println("A vásárlói kosarának az értéke eddig: " + sumAmount + " -Ft");
            System.out.println("Szeretne még tovább vásárolni (Igen/Nem/Kilépés vásárlás nélkül)?");
            String toExit = scanner.nextLine();
            switch (toExit) {
                case "Nem":
                    System.out.println("A vásárlói kosarának az értéke eddig: " + sumAmount + " -Ft");
                    shoppingCont = false;
                    break;
                case "Igen":
                    shoppingCont = true;
                    break;
                case "Kilépés vásárlás nélkül":
                    sumAmount = 0;
                    System.out.println("A vásárlói kosarának az értéke: " + sumAmount + ",-Ft");
                    shoppingCont = false;
            }
        }
    }
}


