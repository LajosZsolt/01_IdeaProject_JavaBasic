package hu.progmatic.Abstract_Task17_Employee;

public abstract class Employee {
    private String position;
    private String name;
    private String salary;
    private String anyOthers;

    public Employee(String position, String name, String salary, String anyOthers) {
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.anyOthers = anyOthers;
    }


    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                "position='" + position + '\'' +
                ", SalaryPAH='" + salary + '\'' +
                ", anyOthers='" + anyOthers + '\'' +
                '}';
    }
}
