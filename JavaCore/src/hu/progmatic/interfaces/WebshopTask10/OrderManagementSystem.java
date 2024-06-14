package hu.progmatic.interfaces.WebshopTask10;
/**Legyen ez az alkalmazásod belépési pontja. Ez az osztály arra szolgáljon,
 * hogy továbbhívjon a többi osztályba.
*/
 public class OrderManagementSystem {


    public static void main(String[] args) {
        Order order = new Order();
        order.makeOrder();

        ProductAvailabilityService productAvailabilityService = new ProductAvailabilityService();
        if(productAvailabilityService.getAvailable()){
            PaymentService paymentService = new PaymentService();
            int price = paymentService.getPrice();
            int count = order.getProductCount();
            System.out.println("Success! Thank you for your order. The price is: " + price * count);
        }else {
            System.out.println("Something faild. Please contact us.");
        }



    }
}
