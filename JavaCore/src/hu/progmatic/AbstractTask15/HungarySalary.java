package hu.progmatic.AbstractTask15;

public class HungarySalary extends Salary {
    int dailySalary;
    int workedDay;
    private double hungarianTaxes;
    private double salary;
    private double nettoSalary;
    double taxesDouble;


    HungarySalary(double hungarianTaxes, int dailySalary, int workedDay) {
        this.hungarianTaxes = hungarianTaxes;
        salaryCalculation(dailySalary, workedDay);

    }


    @Override
    void salaryCalculation(int dailySalary, int workedDay) {
        taxesDouble = (hungarianTaxes/100)+1;
        salary = dailySalary * workedDay * taxesDouble;
        nettoSalary = dailySalary * workedDay;
    }

    @Override
    public String toString() {
        return "HungarySalary{" +
                "dailySalary=" + dailySalary +
                ", workedDay=" + workedDay +
                ", hungarianTaxes=" + hungarianTaxes +
                ", salary=" + salary +
                ", nettoSalary=" + nettoSalary +
                ", taxesDouble=" + taxesDouble +
                '}';
    }

    public double getNettoSalary() {
        return nettoSalary;
    }
}
