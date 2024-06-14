package enums.Task107;
import enums.LevelNew;
/**Készítsetek egy OrderStatus nevű enumot, mely ACCEPTED, PAYED, TRANSIT, DELIVERED
 * értékeket tartalmaz. A program indítása után kiírja, hogy “Your order is currently … “
 * A … helyén pedig legyen a fenti enumok értéke, például
 * “Your order is currently ACCEPTED and waiting for the payment.”
 * Az pedig, hogy a fenti értékek közül melyiket írja ki a program véletlenszerűen dőljön el.
 * Egy random generált 1-4 közötti szám döntse el a státuszt. Pl.: 1 esetén ACCEPTED
*/
 import java.util.Random;

public class OrderStatus {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumbers = random.nextInt(5); //csak 4-ig szabadna, de így lehet gyakorolni az exeption-t
        System.out.println("Techincal information only: " + randomNumbers);

        String oderStatus = null;
        System.out.print("Your order is currently " );
        switch (randomNumbers) {
            case 0 -> System.out.println(OrderStatusEnum.ACCEPTED + " and waiting for the payment.");
            case 1 -> System.out.println(OrderStatusEnum.PAYED + " and waiting for the shipping.");
            case 2 -> System.out.println(OrderStatusEnum.TRANSIT + " ,you will receive it soon.");
            case 3 -> System.out.println(OrderStatusEnum.DELIVERED + " , we look forward to your satisfied feedback on the product.");
            default -> throw new IllegalStateException("Unexpected value: " + randomNumbers);
        }
    }
}
