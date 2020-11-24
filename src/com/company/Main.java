package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Division program.  Please enter the:");

        double d1 = getInput(sc,"Numerator: ");

        double d2 = getInput(sc,"Denominator: ");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

    private static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

}

