public class Task66_MyFavoriteCar_MethodWithBoolean {


    public static void main(String[] args) {

        String[] carsArray = {"Honda", "VolksWagen ", "Audi", "BMW", "Nissan", "Hyundai", "Tesla"};
        String myFavoriteCar = "Tesla";

        //searchForItemInArray(carsArray, myFavoriteCar);
        if (searchForItemInArray(carsArray, myFavoriteCar)) {
            System.out.println("HURRAY!!!");
        }else{
                System.out.println("");
                System.out.print( "Sorry, your favorite car is not in the list!");
        }
    }

    public static boolean searchForItemInArray(String[] array, String elementToFind) {
        boolean isInArray = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elementToFind)) {
                System.out.println(array[i] + " is in the array, Yeahhh!!!");
                isInArray = true;
                break; // opcionális optimalizálásként, ne fusson tovább a ciklus
                // ha megtalálja a keresett elemet
            }
         //  System.out.print("Check:" + i + ", "); //csak ellenőrzésre
        }
        return isInArray;
    }

}