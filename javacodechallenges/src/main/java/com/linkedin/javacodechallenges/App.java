package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double minimumGallonAmount = 18.84;
        double numberOfGallonInCCF = 748;
        if (gallonsUsage <= numberOfGallonInCCF) {
            return minimumGallonAmount;
        } else {
            double extraGallonUsage = gallonsUsage - numberOfGallonInCCF;
            double extraGallonUsageAmount = Math.ceil(extraGallonUsage / numberOfGallonInCCF) * 3.9;
            return (minimumGallonAmount + extraGallonUsageAmount);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
