package hu.progmatic;

import java.util.Random;


public class Task19 {
    public static void main(String[] args) {


        Random random = new Random();
        // 1-21-ig inclusive
        int studentId1 = random.nextInt(21)+1;
        int studentId2 = random.nextInt(21)+1;
        while (studentId2 == studentId1){
            studentId2 = random.nextInt(21)+1;
        }

        System.out.println("Student: " + studentId1 + " " + studentId2);

        //do while
int studentIdDo1=0, studentIdDo2=0;
        do{
            studentIdDo2 = random.nextInt(21)+1;
            studentIdDo1 = random.nextInt(21)+1;
        }while (studentIdDo2 == studentIdDo1);

        System.out.println("Student: " + studentIdDo1 + " " + studentIdDo2);



    }

}
