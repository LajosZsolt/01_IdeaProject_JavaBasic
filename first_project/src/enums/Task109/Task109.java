package enums.Task109;
import enums.AllEnums;

import java.util.Scanner;
public class Task109 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy hónapot, és eldöntöm milyen évszakban van: ");
        String inputMonth = scanner.nextLine();
        try {
            AllEnums.MonthsInHungarian inputMonthToEnum = AllEnums.MonthsInHungarian.valueOf(inputMonth.toUpperCase());
            System.out.print( inputMonthToEnum + ", ");
            AllEnums.SeasonsInHungarian season = null;
            switch (inputMonthToEnum) {
                case DECEMBER, JANUÁR, FEBRUÁR -> System.out.println("egy téli hónap. - " + AllEnums.SeasonsInHungarian.TÉL);
                case MÁRCIUS, ÁPRILIS, MÁJUS -> System.out.println("egy tavaszi hónap. - " + AllEnums.SeasonsInHungarian.TAVASZ);
                case JÚNIUS, JÚLIUS, AUGUSZTUS -> System.out.println("egy nyári hónap. - " + AllEnums.SeasonsInHungarian.NYÁR);
                case SZEPTEMBER, OKTÓBER, NOVEMBER -> System.out.println("egy őszi hónap. - " + AllEnums.SeasonsInHungarian.ŐSZ);
            }
        }catch (IllegalArgumentException e){
            System.out.println("Ez (" + inputMonth + ") nem valós hónap, ezek a lehetséges értékek: ");
            for (AllEnums.MonthsInHungarian month : AllEnums.MonthsInHungarian.values()){
                System.out.print(month + ", ");
            }
        }
    }
}
