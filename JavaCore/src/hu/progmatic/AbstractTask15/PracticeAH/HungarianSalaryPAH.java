package hu.progmatic.AbstractTask15.PracticeAH;

public class HungarianSalaryPAH extends SalaryPAH {
    private double hungarianTaxes;
    private double saraly;
    private double taxesDouble;
    private double nettoSalary;

    HungarianSalaryPAH(int hungarianTaxes, int dailySalary, int workedDay) {
        this.hungarianTaxes = hungarianTaxes;
        salaryCalculation(dailySalary, workedDay);
    }

    @Override
    void salaryCalculation(int dailySalary, int workedDay) {
        taxesDouble = (hungarianTaxes + 100) / 100;
        saraly = dailySalary * workedDay * taxesDouble;
        nettoSalary = dailySalary * workedDay;
    }


    @Override
    public String toString() {
        return "HungarianSalaryPAH{" +
                "hungarianTaxes=" + hungarianTaxes +
                ", saraly=" + saraly +
                ", taxesDouble=" + taxesDouble +
                ", nettoSalary=" + nettoSalary +
                '}';
    }
}
