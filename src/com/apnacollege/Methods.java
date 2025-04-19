package com.apnacollege;

import java.util.*;
import java.math.*;

public class Methods {


    // print my name method
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    // sum of two numbers method
    // call by Value
    public static int calculateSum(int n1, int n2) {
        return n1 + n2;
    }

    // product of two numbers method
    public static int calculateProduct(int n1, int n2) {
        return n1 * n2;
    }

    // factorial of a number method
    public static int calculateFactorial(int n1) {
        if (n1 < 0) {
            throw new IllegalArgumentException("Factorial of negative number is not defined");
        }
        int factorial = 1;
        for (int index = 1; index <= n1; index++) {
            factorial *= index;
        }
        return factorial;
    }

    // GCD of n1 and n2 method
    public static int calculateGCD(int n1, int n2) {
        int gcd = 1;
        int min = Math.min(n1, n2); // find the minimum of n1 and n2
        for (int index = min; index >= 1; index--) {
            if (n1 % index == 0 && n2 % index == 0) {
                gcd = index;
                break;
            }
        }
        return gcd;
    }

    // optimized
//    public static int calculateGCD(int n1, int n2) {
//        while (n2 != 0) {
//            int temp = n2;
//            n2 = n1 % n2;
//            n1 = temp;
//        }
//        return n1;
//    }

    public static void main(String[] args) {

        // Functions & Methods

        // print my name method call
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);

        // input two numbers and print the sum
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = calculateSum(n1, n2);
        System.out.println("Sum of " + n1 + " and " + n2 + " is: " + sum);

        // input two numbers and print the product
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int prod = calculateProduct(n1, n2);
        System.out.println("Product of " + n1 + " and " + n2 + " is: " + prod);

        // input a number and calculate factorial of the number
        n1 = sc.nextInt();
        int factorial = calculateFactorial(n1);
        System.out.println("Factorial of " + n1 + " is: " + factorial);

        // circumference of a circle
        int radius = sc.nextInt();
        double circum = 2 * Math.PI * radius;
        System.out.println("Circumference of a circle of radius " + radius + " is: " + circum);

        // power of a number raised to a power, i.e; x^n
        int x = sc.nextInt();
        int n = sc.nextInt();
        long power = (long)Math.pow(x, n);
        System.out.println("Power of " + x + " to power " + n + " is: " + power);

        // fibonacci series
        int num = sc.nextInt();
        int a = 0, b = 1;
        for (int index = 1; index <= num; index++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
//        sc.close();

        // GCD of two numbers
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int gcd = calculateGCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + "  is: " + gcd);


    }
}
