package hu.progmatic.interfaces.WebshopTask10;
/** Számolja ki a fizetendő összeget.
 */
 import java.util.Random;

public class PaymentService {

    public int getPrice(){
        Random random = new Random();
        int price = random.nextInt(10000)+1;
        return price;
    }

}
