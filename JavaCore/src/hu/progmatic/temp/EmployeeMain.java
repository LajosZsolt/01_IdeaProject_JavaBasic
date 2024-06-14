package hu.progmatic.temp;

public class EmployeeMain {

    public static void main(String[] args) {


        Employee anonymus = new Employee();

        Employee bob = new Employee("Bob");

        Employee kateTheDeveloper = new Employee("Kate", "developer");

        Employee zsoltTheTester = new Employee("Zsolt", "tester");

        System.out.println(anonymus.getName());
        System.out.println(bob.getName());
        System.out.println(kateTheDeveloper.getName());
        System.out.println(kateTheDeveloper.getRole());
        System.out.println(kateTheDeveloper.getClass());
        System.out.println(zsoltTheTester.getName() + " \n" + zsoltTheTester.getRole()) ;
    }
}
