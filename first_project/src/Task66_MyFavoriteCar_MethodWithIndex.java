public class Task66_MyFavoriteCar_MethodWithIndex {

    public static int findElementIntArray(String[] array, String elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elementToFind)) {
                return i;
            }
        }
        return -1; // invalid értéket adunk meg, hogy kiderüljön hogy hiba van a fügvény futása közben.
    }
    public static void main(String[] args) {

        String[] cars = {"Honda", "VolksWagen ", "Teslla", "Audi", "BMW", "Nissan", "Hyundai", "Teslla"};
        String myFavoriteCar = "Tesla";

        int favIndex = findElementIntArray(cars, myFavoriteCar);
        if (favIndex == -1) {
            System.out.println("Not contains the list!");
        } else {
            System.out.println("Your favorite car " + cars[favIndex] + " is in the list!");

        }
    }
}