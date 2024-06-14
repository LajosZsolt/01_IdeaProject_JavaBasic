package hu.progmatic.oroklodes.EmployeeTask9;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Péter", 44, "midle", "all area");
        DirectReport worker = new DirectReport("Júlia", 22, "Middle","front end", true);
        Manager manager = new Manager("Sándor",55,"very high", "full stack", "all area, at 4 company");


        System.out.println("---------Employee--------");
        employee.getWages();
        System.out.println(employee);
        System.out.println("");

        System.out.println("---------Manager--------");
        manager.manager();
        manager.getWages();
        System.out.println(manager);
        System.out.println("");

        System.out.println("---------Worker/Direct Report--------");
        worker.skilled();
        worker.getWages();
        System.out.println(worker);


    }
}
