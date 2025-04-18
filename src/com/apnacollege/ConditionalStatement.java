package com.apnacollege;

import java.util.*;

public class ConditionalStatement {

    public static void main(String[] args) {

         /*
          * Conditional Statements:
          * if else
          * else if
          * switch
          * break
          */
        // if else
        Scanner sc = new Scanner(System.in);

        // age check - Adult or Minor
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are adult!");
        }
        else {
            System.out.println("Your are minor!");
        }

        // odd or even
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // else if
        // input a and b,
        // if a == b -> Equal
        // if a > b -> a is greater
        // if a < b -> a is lesser
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        }
        else if (a > b) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("a is lesser");
        }

        // switch like case
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello");
        }
        else if (button == 2) {
            System.out.println("Namaste");
        }
        else if (button == 3) {
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Unknown");
        }

        // switch
        // switch condition can be integer, char, string
        int switch_button = sc.nextInt();
        switch(switch_button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
