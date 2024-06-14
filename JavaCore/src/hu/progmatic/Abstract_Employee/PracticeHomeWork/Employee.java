package hu.progmatic.Abstract_Employee.PracticeHomeWork;

public abstract class Employee {
    protected String name;
    protected String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    abstract void comutePay();

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
