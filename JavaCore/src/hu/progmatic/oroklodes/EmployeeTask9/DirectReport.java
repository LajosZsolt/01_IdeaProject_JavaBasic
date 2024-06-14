package hu.progmatic.oroklodes.EmployeeTask9;

public class DirectReport extends Employee {
    private boolean memberOfUnion;

    public DirectReport(String name, int age, String educationDegree, String workExperience, boolean memberOfUnion) {
        super(name, age, educationDegree, workExperience);
        this.memberOfUnion = memberOfUnion;
    }

    public void skilled() {
        System.out.println("All workers are skilled");
    }

    public boolean isMemberOfUnion() {
        return memberOfUnion;
    }

    public void setMemberOfUnion(boolean memberOfUnion) {
        this.memberOfUnion = memberOfUnion;
    }

    @Override
    public String toString() {
        return "DirectReport{" +
                "memberOfUnion=" + memberOfUnion +
                " , " + super.toString() +
                '}';
    }
}
