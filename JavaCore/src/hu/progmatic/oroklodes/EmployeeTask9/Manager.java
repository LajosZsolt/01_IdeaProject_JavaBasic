package hu.progmatic.oroklodes.EmployeeTask9;

public class Manager extends Employee{
    private String leadershipExperience;

    public Manager(String name, int age, String educationDegree, String workExperience, String leadershipExperience) {
        super(name, age, educationDegree, workExperience);
        this.leadershipExperience = leadershipExperience;

    }
    
    public Manager(String name, int age, String educationDegree, String workExperience) {
        super(name, age, educationDegree, workExperience);
    }

    public Manager(String name, int age, String educationDegree) {
        super(name, age, educationDegree);
    }





    public String getLeadershipExperience() {
        return leadershipExperience;
    }

    public void setLeadershipExperience(String leadershipExperience) {
        this.leadershipExperience = leadershipExperience;
    }

    public void manager() {
        System.out.println("Has leadership Experince in the following areas....");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "leadershipExperience='" + leadershipExperience + '\'' +
                " , " + super.toString() +
                '}';
    }
}
