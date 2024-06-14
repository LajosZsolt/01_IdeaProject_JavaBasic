//import java.util.*;
//
//public class Task57_Array_Library {
//
//    public static void main(String[] args) {
//
//
//        List<String > bookList = Arrays.asList("Son", "Harry Potter V", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");
//        HashMap<String, Integer> bookCountMap = new HashMap<>();
//        int sumOfBooks = 0;
//
//        for (String bookTitle :bookList) {
//            if(bookCountMap.containsKey(bookTitle)) {
//               int originaCount =  bookCountMap.get(bookTitle);
//                bookCountMap.put(bookTitle, originaCount + 1);  // felülírom a könyv darabszámát
//            }else{
//                bookCountMap.put(bookTitle, 1);
//            }
//        }
//
//        //task d - foreach to override book count with 4 count ot 3
//        List<String> booksWithCountFour = new ArrayList<>();
//
//        for (Map.Entry mapElement : bookCountMap.entrySet()) {
//                 if (bookCountMap.containsValue(4))
//            mapElement.setValue(3)}
//            if (bookCountMap.containsKey("bookTitle"))
//                mapElement.setValue()
//        }
//
//
//        // task c - foreach for remove books with 1 count
//        String removeItem= "";
//        List<String> booksWithCountOne = new ArrayList<>();
//        for (Map.Entry mapElement: bookCountMap.entrySet()) {
//            if ((int) mapElement.getValue() == 1){
//                booksWithCountOne.add((String) mapElement.getKey());
//            }
//        }
//
//
//        //task c - foreach to remove saved books with 1 count
//        for (String bookTitle : booksWithCountOne){
//            booksWithCountOne.remove(bookTitle);
//        }
//
//
//        // task b
//        for (Map.Entry mapElement: bookCountMap.entrySet()) {
//            System.out.println(mapElement.getKey() + " " + mapElement.getValue() + " darab" );
//            sumOfBooks += (int) mapElement.getValue();
//        }
//
//        //task a
//
//
//        System.out.println(bookCountMap);
//        System.out.println(        );
//
//
//
//        System.out.println();
//        System.out.println("Number of different books: " + bookCountMap.size());
//        System.out.println("Number of books, at all: " + bookList.size());
//        System.out.println("Number of books, at all (second method): " + sumOfBooks);
//    }
//}
