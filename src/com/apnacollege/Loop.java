package com.apnacollege;

import java.util.*;

public class Loop {

    public static void main(String[] args) {

        // Loops
        // 1. while loop
        // 2. for loop
        // 3. do while loop
        // 4. for each loop

//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        // for loop
        for (int counter = 0; counter <= 10; counter++) {
            System.out.println("Hello World");
        }

        // infinite loop
        // for (;;)

        // counter print
        for (int counter = 0; counter <= 10; counter++) {
            System.out.print(counter + " ");
        }
        System.out.println();

        // while loop
        int counter = 0;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

        // do while loop -> run at least one time
        int counter1 = 0;
        do {
            System.out.print(counter1 + " ");
            counter1++;
        } while (counter1 <= 10);

        System.out.println();

        // for each loop
        String[] names = {"A", "B", "C", "D"};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("---------------------------");

        // Question: Input a number n, print sum of 1 to n.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int index = 1; index <= n; index++) {
            sum += index;
        }
        System.out.println("Sum of 1 to " + n + " is " + sum);

        System.out.println("---------------------------");

        // Question: Input a number n, print the table of the number.
        int number = sc.nextInt();
        for (int index = 1; index <= 10; index++) {
            System.out.print(number * index + " ");
        }

        System.out.println("\n---------------------------");
    }
}
