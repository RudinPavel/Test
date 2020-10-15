package com.company;

import java.util.Arrays;

public class Main2 {

    static int func = 10;

    static void func() {

    }

    public static void main(String[] args) {
        String s1 = "test1"; // immutable
        String s2 = new String("test2");

        char[] chars = new char[5];
        chars[0] = 't'; // 0
        chars[1] = 'e'; // 1
        chars[2] = 's';
        chars[3] = 't';
        chars[4] = '2';

        String s5 = new String(chars);
        System.out.println("s5 = " + s5);

        char[] charArray = s5.toCharArray();

        System.out.println("Symbol1=" + s5.charAt(1));

        int i = 10; // 100;

        System.out.println(1 + 3);
        System.out.println("i = " + i);
        // i = 10
        s5.concat("test");

        String input = "Hello World My Name Test";
        String input2 = "1 2 3 4 5 19";
        String input3 = "1,2,3,4,5,19";

        String[] rows = input.split(" ");
        System.out.println(Arrays.toString(rows));
        System.out.println(Arrays.toString(input3.split(",")));

        System.out.print("[");
        for (String s :
                rows) {
            System.out.print(s + ", ");
        }
        System.out.print("]");
        //System.out.println(s5.length());
        System.out.println();
        System.out.println();
        for (String s :
                rows) {
            System.out.println(s);
        }

        String s4 = s5.toUpperCase();
        s5.toLowerCase();

        s5.compareTo(s4);
        //System.out.println();

        // connect to DB
        // String user, pass, url
    }
}
