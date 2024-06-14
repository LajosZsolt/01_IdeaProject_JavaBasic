package hu.progmatic.Abstract_Employee.PracticeHomeWork;

public class HrAssistant extends Employee{
    private boolean noMorePeople = true;
    private int salary;

    public HrAssistant(String name, String position, boolean noMorePeople) {
        super(name, position);
        this.noMorePeople = noMorePeople;
        comutePay();
    }

    @Override
    void comutePay() {
        if (noMorePeople) {
            salary = 101;
        } else {
            salary = 1000001;
        }
    }

    @Override
    public String toString() {
        return "HrAssistant{" +
                "noMorePeople=" + noMorePeople +
                ", SalaryPAH=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
