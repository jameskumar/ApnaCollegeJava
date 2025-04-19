package com.apnacollege;

import java.util.*;

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

    }
}
