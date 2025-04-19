package com.apnacollege;

public class Patterns {

    public static void main(String[] args) {

        // Nested Loops
        // rows -> outer loop
        // columns -> inner loop

        // Basic Patterns
        // Video - 1
        // First Pattern
        /*
        * Print the below patterns:
        * *****
        * *****
        * *****
        * *****
        * */

        for (int row = 1; row <=4; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Second Pattern
        /*
        * *****
        * *   *
        * *   *
        * *****
        * */

        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= 5; column++) {
                if ((row == 1 || row == 4) || (column == 1 || column == 5)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Third Pattern
        /*
        * Half pyramid pattern
        * *
        * **
        * ***
        * ****
        * */

        for (int row = 1; row <= 4; row++) {
            for (int column = 1;  column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Fourth Pattern
        /*
         * Inverted Half pyramid pattern
         * ****
         * ***
         * **
         * *
         * */

        for (int row = 4; row >= 1; row--) {
            for (int column = 1;  column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Fifth Pattern
        /*
         * Inverted Half pyramid pattern (rotated by 180 deg)
         *    *
         *   **
         *  ***
         * ****
         * */

        for (int row = 1; row <= 4; row++) {
            for (int column = 4;  column >= 1; column--) {
                if(column <= row) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Sixth Pattern
        /*
         * Half pyramid pattern with Numbers
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * */

        for (int row = 1; row <= 5; row++) {
            for (int column = 1;  column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Seventh Pattern
        /*
         * Inverted Half pyramid pattern with Numbers
         * 12345
         * 1234
         * 123
         * 12
         * 1
         * */

        for (int row = 5; row >= 1; row--) {
            for (int column = 1;  column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Eighth Pattern
        /*
         * Floyd's Triangle
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * */

        int counter = 1;
        for (int row = 1; row <= 5; row++) {
            for (int column = 1;  column <= row; column++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Ninth Pattern
        /*
         * Floyd's Triangle
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * */

        for (int row = 1; row <= 5; row++) {
            for (int column = 1;  column <= row; column++) {
                System.out.print(((row + column + 1) % 2)  + " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Advanced Patterns
        // Video - 2

        // Tenth Pattern




    }
}
