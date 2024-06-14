package hu.progmatic.task5RegistrationForm;

import java.util.Scanner;

public class RegistrationMain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your e-mail address:");
        String email = scanner.nextLine();
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your birthday date:");
        String birthday = scanner.nextLine();
        System.out.println("Please enter your workplace:");
        String workplace = scanner.nextLine();
        System.out.println("Please enter your phone number:");
        String phone = scanner.nextLine();

        // if(phone.length() == 0)
        // if(phone.equals(""))

        if (email.isEmpty() || name.isEmpty() || birthday.isEmpty()) {
            System.out.println("The email, name and the birth date must not be empty!");
            //return; //megszakítja a program futását, kilép
            System.exit(0);     //vagy ez, ez beszédesebb is!
        }
        User testElek = new User(email, name, birthday);

        if (!workplace.isEmpty()) {
            testElek.setCompany(workplace);
        }
        if (!phone.equals("")) {    // vagy ez a feltétel is jó if(phone.length() > 0))
            testElek.setPhone(Integer.parseInt(phone));
        }

        System.out.println(testElek);

    }
}
