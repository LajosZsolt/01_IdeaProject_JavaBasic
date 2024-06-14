package hu.progmatic.interfaceStudent;

public class StudentRunner {

    public static void main(String[] args) {

        StudentFileOperations saveStudentOne = new StudentFileOperations();

        saveStudentOne.save("TothBela - 6c");

        System.out.print("Read the student data: ");
        System.out.println(saveStudentOne.read());

    }
}
