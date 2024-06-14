import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task56_Map_Invoices {

    public static void main(String[] args) {
        System.out.println("List your invoices");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> invoiceList = new HashMap<>();
        String invoice;
        int amountOfInvoice;
        int counter = 0;
        boolean cont = true;
        int sumOfAmounts = 0;


// while ciklusban, a lista folyamatos bekérése, amíg megvan a 3 tétel
        while (invoiceList.size()<3) {
            System.out.println("Give me your invoice (electric, gas, water):" + "(Already " + invoiceList.size() + " items on your list!)");
            invoice = scanner.nextLine();
            System.out.println("Give me the amount of the invoice: ");
            amountOfInvoice = Integer.parseInt(scanner.nextLine());
            invoiceList.put(invoice, amountOfInvoice);
// Ha nulla forintos számlát rögzít, akkor azt töröljük
            if ( amountOfInvoice == 0){
                invoiceList.remove(invoice,amountOfInvoice);
            }

        }

        for (Map.Entry mapElement : invoiceList.entrySet()) {
            sumOfAmounts = sumOfAmounts + (int) mapElement.getValue();
        }
        System.out.println(invoiceList);
        System.out.println("Number of invoices: " + invoiceList.size());
        System.out.println("Sum of all Amounts: " + sumOfAmounts);
    }
}