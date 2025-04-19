package com.apnacollege;

import java.lang.*;

public class StringBuilders {

    public static void main(String[] args) {

        // StringBuilders - to make changes to string,
        // we need to use StringBuilder class
        // StringBuilder is mutable - can be changed
        // StringBuilder is not thread safe
        // StringBuilder is faster than String

        // StringBuilder is a child class of AbstractStringBuilder
        // AbstractStringBuilder is a parent class of StringBuilder


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(0, 'S');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());






    }
}
