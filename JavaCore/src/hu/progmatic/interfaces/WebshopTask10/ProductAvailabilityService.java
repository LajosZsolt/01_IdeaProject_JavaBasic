package hu.progmatic.interfaces.WebshopTask10;
/**Adja vissza, hogy az adott termék van-e raktáron.
*/
 import java.util.Random;

public class ProductAvailabilityService {


    public boolean getAvailable() {
        Random random = new Random();
        int result = random.nextInt(4);
        if (result == 0)
            return false;
        else
            return true;
    }
}
