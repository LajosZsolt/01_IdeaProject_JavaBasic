public class Task30_Arrays_het_napjai {
    public static void main(String[] args) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        String[] weekdays2 = new String[7];

        System.out.println(weekdays.length);

        for (int valtozo = 0; valtozo < weekdays.length; valtozo++)  {
            System.out.println(weekdays[valtozo]);
        }

        System.out.println(weekdays[weekdays.length-1]);

        System.out.println("My favorite day is: " + weekdays[4]);
    }
}
