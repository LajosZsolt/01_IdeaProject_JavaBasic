package hu.progmatic.Abstract_Task16_Dogs;

public class DogRunner {

    public static void main(String[] args) {
        DogsReader dogsReader = new DogsReader();
        dogsReader.readCsvFiles();
        System.out.println(dogsReader.getDogs());
        System.out.println(dogsReader.getDogs().size());




    }
}
