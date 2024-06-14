package hu.progmatic.oroklodes.EmployeeTask9;

public class Employee {
    private String name;
    private int age;
    private String educationDegree;
    private String workExperience;

    public Employee(String name, int age,String educationDegree, String workExperience){
        this.educationDegree = educationDegree;
        this.workExperience = workExperience;
        this.name = name;
        this.age = age;
    }
    public Employee(String name, int age,String educationDegree) {
        this.educationDegree = educationDegree;
        this.name = name;
        this.age = age;
    }


    public void getWages(){
        System.out.println("Most of the Employee get paid for their work.");
    }


    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", educationDegree='" + educationDegree + '\'' +
                ", workExperience='" + workExperience + '\'' +
                '}';
    }
}
