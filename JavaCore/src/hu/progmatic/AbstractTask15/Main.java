package hu.progmatic.AbstractTask15;

import hu.progmatic.Abstract_Employee.PracticeHomeWork.HrAssistant;

public class Main {
    public static void main(String[] args) {
        HungarySalary hunSalary = new HungarySalary(37, 40000, 18);

        System.out.println(hunSalary);

        System.out.println(hunSalary.getNettoSalary());

    }

}
