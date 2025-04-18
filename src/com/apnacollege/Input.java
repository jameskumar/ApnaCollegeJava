package com.apnacollege;

import java.math.*;
import java.util.*;

public class Input {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        // next is not working for nextLine, so prefer nextLine
//        String name = sc.next();
//        System.out.println("name is: " + name);

        String name = sc.nextLine();
        System.out.println("name is: " + name);

        String full_name = sc.nextLine();
        System.out.println("Full name is: " + full_name);

        // Integer
        int age = sc.nextInt();
        System.out.println("age is: " + age);

        // BigInteger
        BigInteger bigInteger = sc.nextBigInteger();
        System.out.println("bigInteger is: " + bigInteger);

        float price = sc.nextFloat();
        System.out.println("price is (float): " + price);

        double price_double = sc.nextDouble();
        System.out.println("price is (double): " + price_double);

        // question: Take a and b as input and print sum of a and b
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));

    }
}
