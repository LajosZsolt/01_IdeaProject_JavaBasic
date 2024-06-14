package enums.Task107;
/**
 * Készítsetek egy OrderStatus nevű enumot, mely ACCEPTED, PAYED, TRANSIT, DELIVERED
 * értékeket tartalmaz. A program indítása után kiírja, hogy “Your order is currently … “
 * A … helyén pedig legyen a fenti enumok értéke, például
 * “Your order is currently ACCEPTED and waiting for the payment.”
 * Az pedig, hogy a fenti értékek közül melyiket írja ki a program véletlenszerűen dőljön el.
 * Egy random generált 1-4 közötti szám döntse el a státuszt. Pl.: 1 esetén ACCEPTED
 */

import java.util.Random;

public class OrderStatus_Method {

    public static void main(String[] args) {
        int randomNumbers = UtilMethods.getARandomNumber(4, true);
        String prefix = "Your order is currently ";
        System.out.println(prefix + getOrderStatus(randomNumbers));
    }

    public static String getOrderStatus(int randomNumbers) {
        String result = null;
        switch (randomNumbers) {
            case 0 -> result = (OrderStatusEnum.ACCEPTED + " and waiting for the payment.");
            case 1 -> result = (OrderStatusEnum.PAYED + " and waiting for the shipping.");
            case 2 -> result = (OrderStatusEnum.TRANSIT + " ,you will receive it soon.");
            case 3 ->
                    result = (OrderStatusEnum.DELIVERED + " , we look forward to your satisfied feedback on the product.");
            default -> throw new IllegalStateException("Unexpected value: " + randomNumbers);
        }
        return result;
    }
}
