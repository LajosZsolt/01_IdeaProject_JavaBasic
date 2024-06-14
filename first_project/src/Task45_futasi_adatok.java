package hu.progmatic;

//(Órai) Készítsünk egy elemzést a legutóbbi futásainkról. Az adatokat már kinyertük az
// aktivitás tracker-ünkbők, az alábbi formában: Arrays.asList
//Ami a feladat, hogy írassuk ki a konzolra a listában található
// legnagyobb, legkisebb és átlagos sebességet.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task45_futasi_adatok {
    public static void main(String[] args) {

        List<Double> runningData = Arrays.asList(12.30, 12.45, 12.35, 12.54, 12.53, 12.45, 12.61, 12.62, 12.73, 12.91, 12.90, 12.72, 12.85, 12.90, 12.70, 12.58, 12.61, 12.67, 12.63, 12.61, 12.74, 12.84, 12.99, 13.10, 13.21, 13.39, 13.23, 13.09, 13.15, 13.00, 12.91, 12.85, 12.89, 13.00, 13.03, 13.16, 13.25, 13.35, 13.36, 13.28, 13.42, 13.49, 13.36, 13.32, 13.20, 13.23, 13.20, 13.02, 12.91, 12.74, 12.81, 12.63, 12.79, 12.65, 12.59, 12.77, 12.77, 12.89, 12.76, 12.76, 12.91, 12.90, 12.86, 12.89, 12.83, 12.67, 12.69, 12.65, 12.73, 12.87);

        int runningTimes = runningData.size();
        double runningSum = 0;
        double maxRunningData = 0;
        double minRunningData = runningData.get(1);

        for (int i = 0; i < runningData.size(); i++) {
            runningSum += runningData.get(i);
            if (maxRunningData < runningData.get(i)) {
                maxRunningData = runningData.get(i);
            }
            if (minRunningData > runningData.get(i)) {
                minRunningData = runningData.get(i);
            }
        }


//        minRunningData = maxRunningData;
//        for (int i = 0; i < runningData.size(); i++) {
//            if (minRunningData > runningData.get(i)) {
//                minRunningData = runningData.get(i);
//            }


        //System.out.println(runningSum);
        System.out.println("Average running speed= " + runningSum / runningData.size());
        System.out.println("Maximum running speed= " + maxRunningData);
        System.out.println("Minimum running speed= " + minRunningData);

    }
}
