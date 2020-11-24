package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static void printResult(double result) {
        System.out.println("The answer is: " + result);
    }

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1,d2;
        double result = 0;
        try {
            System.out.print("Enter a numeric value: ");
            d1 = sc.nextDouble();

            System.out.print("Enter a numeric value: ");
            d2 = sc.nextDouble();
        } catch (InputMismatchException e) {
                System.out.println("Couldn't format as a number");
                return;
        }

                System.out.print("Enter an operation: +,-,*,/: ");
            var op = sc.next();

            switch (op) {
                case "+":
                    result = d1 + d2;
                    printResult(result);
                    break;
                case "-":
                    result = d1 - d2;
                    printResult(result);
                    break;
                case "*":
                    result = d1 * d2;
                    printResult(result);
                    break;
                case "/":
                    result = d1 / d2;
                    printResult(result);
                    break;
                default:
                    System.out.println("Error: Wrong operation entered.");
                    return;
            }
        System.out.println("The answer is: " + result);
    }

}

