package com.apnacollege;

import java.util.*;

public class Strings {

    public static void main(String[] args) {

        // Strings
        // String Declaration
        String name = "Tony";
        String fullName = "Tony Stark";

        // String Input
        Scanner sc = new Scanner(System.in);
        String name_input = sc.nextLine();
        System.out.println("Your name is " + name_input);

        // String Concentration
        String fName = "Tony";
        String lName = "Stark";
        String fullName_con = fName + " " + lName;
        System.out.println(fullName_con);

        // String Length
        System.out.println(fullName_con.length());

        // charAt
        System.out.println(fullName_con.charAt(0));

        // compare
        System.out.println(fullName_con.compareTo(lName));

        // 1 s1 > s2: +ve value
        // 2 s1 == s2: 0
        // 3 s1 < s2: -ve value

        // substring
        System.out.println(fullName_con.substring(0, 4));  // excluded 4th index

        // Strings are Immutable
        // To modify anything use the new String


    }
}
