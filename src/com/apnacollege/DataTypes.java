package com.apnacollege;

public class DataTypes {

    public static void main(String[] args) {

        // Data Types
        int a = 10;
        int b = 25;

        // Sum
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Diff
        int diff = b - a;
        System.out.println("Diff of " + b + " and " + a + " is: " + diff);

        // Multiplication
        int mul = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + mul);

        // Division
        double div = (double)b/ a;  // type casting like c/c++
        System.out.println("Division of " + b + " and " + a + " is: " + div);

        byte byte_var = 0x10; // 1 byte data
        System.out.println("Byte value is (Decimal): " + byte_var);
        System.out.println("Byte value is (Hex): 0x" + Integer.toHexString(byte_var & 0xFF));       // Masking to get the last 8 bits and as a positive value
        System.out.println("Byte value is (Binary): " + Integer.toBinaryString(byte_var & 0xFF));   // Masking to get the last 8 bits and as a positive value

        // quiz: calculate a x b / a - b for a = 10, b = 5
//        a = 10;
        b = 5;
        System.out.println("Quiz answer: " + ((a * b) / (a - b)) );
    }
}
