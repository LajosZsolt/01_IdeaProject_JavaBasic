package hu.progmatic.Abstract_Employee.PracticeHomeWork;

public class SoftwareTester extends Employee {
        private int bugCount;
        private int salary;

    public SoftwareTester(String name, String position, int bugCount) {
        super(name, position);
        this.bugCount = bugCount;
        comutePay();
    }

    @Override
    void comutePay() {
        salary=bugCount*2000;
    }


    @Override
    public String toString() {
        return "SoftwareTester{" +
                "bugCount=" + bugCount +
                ", SalaryPAH=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
