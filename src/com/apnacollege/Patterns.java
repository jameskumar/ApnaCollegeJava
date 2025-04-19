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

        for (int row = 1; row <= 4; row++) {
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
                } else {
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
            for (int column = 1; column <= row; column++) {
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
            for (int column = 1; column <= row; column++) {
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
            for (int column = 4; column >= 1; column--) {
                if (column <= row) {
                    System.out.print("*");
                } else {
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
            for (int column = 1; column <= row; column++) {
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
            for (int column = 1; column <= row; column++) {
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
            for (int column = 1; column <= row; column++) {
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
            for (int column = 1; column <= row; column++) {
                System.out.print(((row + column + 1) % 2) + " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Advanced Patterns
        // Video - 2

        // Tenth Pattern
        /*
         * Butterfly Pattern
         * *      *
         * **    **
         * ***  ***
         * ********
         * *******
         * ***  ***
         * **    **
         * *      *
         * */

        for (int row = 1; row <= 8; row++) {
            for (int column = 1; column <= 8; column++) {
                if (row <= 3) {
                    if (column <= row) {
                        System.out.print("*");
                    } else if (column >= 8 - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (row == 4 || row == 5) {
                    System.out.print("*");
                } else {
                    if (column <= 8 - row + 1) {
                        System.out.print("*");
                    } else if (column >= row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // More optimized way to print the above pattern
        // Just analyse the number of '*' and spaces, then you'll find below clue:
        // you will find that '*' -> 1 -> row where n = 4
        // and spaces -> 2*(n - row) where n = 4
        int n = 4;
        // top of the pattern
        for (int row = 1; row <= n; row++) {
            // print the first half of the top pattern
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            // print spaces part of the top pattern
            for (int column = 1; column <= 2 * (n - row); column++) {
                System.out.print(" ");
            }
            // print the second half of the top pattern
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // bottom of the pattern
        // reverse the outer loop
        for (int row = n; row >= 1; row--) {
            // print the first half of the bottom pattern
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            // print spaces part of the bottom pattern
            for (int column = 1; column <= 2 * (n - row); column++) {
                System.out.print(" ");
            }
            // print the second half of the bottom pattern
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Eleventh Pattern
        /*
         * Solid Rhombus Pattern
         *     *****
         *    *****
         *   *****
         *  *****
         * *****
         * */

        n = 5;
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int column = 1; column <= n - row; column++) {
                System.out.print(" ");
            }
            // print '*'
            for (int column = 1; column <= n; column++) {
                System.out.print("*");
            }

            // print new line
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Twelfth Pattern
        /*
        * Number Pyramid Pattern
        *     1
        *    2  2
        *   3  3  3
        *  4  4  4  4
        * 5  5  5  5  5
        * */

        n = 5;
        for (int row = 1; row <= n; row++) {
           // print spaces
           for (int column = 1; column <= n - row; column++) {
               System.out.print(" ");
           }
           // print numbers
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }

            // print newline
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Thirteenth Pattern
        /*
        * Palindromic Pattern
        *     1
        *    212
        *   32123
        *  4321234
        * 543212345
        * */

        n = 5;
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int column = 1; column <= n - row; column++) {
                System.out.print(" ");
            }
            // print numbers - first half
            for (int column = row; column >= 1; column--) {
                System.out.print(column);
            }
            // print numbers - second half
            for (int column = 2; column <= row; column++) {
                System.out.print(column);
            }

            // print newline
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // Fourteenth Pattern
        /*
        * Diamond Pattern
        *    *
        *   ***
        *  *****
        * *******
        *  *******
        *   *****
        *    ***
        *     *
        * */

        n = 4;
        // first half of the pattern
        for (int row = 1; row <= n; row ++) {
            // print spaces
            for (int column = 1; column <= n - row; column++) {
                System.out.print(" ");
            }
            // print '*'
            for (int column = 1; column <= 2 * (row - 1) + 1; column++) {
                System.out.print("*");
            }

            // print newline
            System.out.println();
        }

        // second half of the pattern
        for (int row = n; row >= 1; row --) {
            // print spaces
            for (int column = 1; column <= n - row + 1; column++) {
                System.out.print(" ");
            }
            // print '*'
            for (int column = 1; column <= 2 * (row - 1) + 1; column++) {
                System.out.print("*");
            }

            // print newline
            System.out.println();
        }

        System.out.println("\n----------------------\n");


    }
}
