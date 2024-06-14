package hu.progmatic.Abstract_Employee;

public class HrAssistan extends Employee {
    private boolean noMorePeople ;
    private int salary;

    public HrAssistan(String name, String position, boolean noMorePeople) {
        super(name, position);
        this.noMorePeople = noMorePeople;
        comutePay();
    }


    @Override
    void comutePay() {
        if (noMorePeople) {
            salary = 100;
        } else {
            salary = 1000000;
        }
    }

    @Override
    public String toString() {
        return "HrAssistan{" +
                "noMorePeople=" + noMorePeople +
                ", SalaryPAH=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
