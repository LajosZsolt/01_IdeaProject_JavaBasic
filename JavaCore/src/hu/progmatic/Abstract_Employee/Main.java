package hu.progmatic.Abstract_Employee;

public class Main {
    public static void main(String[] args) {
        SoftwareTester john = new SoftwareTester("john", "Junior Tester", 37);
        System.out.println(john);
        HrAssistan magdianyus = new HrAssistan("Magdi", "HrAssistant", false);
        System.out.println(magdianyus);


    }
}
