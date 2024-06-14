package hu.progmatic.Abstract_Task17_Employee;

public class EmployeeRunner {

    public static void main(String[] args) {
        EmployeeReader employeeReader = new EmployeeReader();
        employeeReader.readCsvFile();
        System.out.println(employeeReader.getEmloyeeList());
        System.out.println(employeeReader.getEmloyeeList().size());
       // System.out.println(employeeReader.getFileContent());  //csak a jobb megértésért
        System.out.println("Here is the Testers: " + employeeReader.getTesterList());
        System.out.println(employeeReader.getTesterList().size());
    }




}
