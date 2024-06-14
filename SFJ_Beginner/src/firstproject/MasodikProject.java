package firstproject;
//itt látható, hogy ha nem állítom be a name változót,
// azt hiába állítottam be a másik main methodusban itt akkor is null!!!
public class MasodikProject {


    public static void main(String[] args) {
        Human first = new Human();

        first.writeMyName();
        first.setAge(18);

//        boolean empty = (first.getName() == null);
//        System.out.println(empty == true ? "Üres" : "Nem üres, az értéke " + first.getName());
        System.out.println(first.getName() == null ? "Üres" : "Nem üres, az értéke " + first.getName());

        System.out.print((first.getAge())+ "\n");

    }

}
