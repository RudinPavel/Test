package com.company;

import java.util.Scanner;


public class Main4 {

    private static int createdCount = 0;

    public Main4(){
        createdCount++;
    }

    private static double tax = 0.2;
    private double newTax = 0.3;

    public static double returnTax(double price) {
        return price + price * tax;
    }

//    public double returnTax2(double price) {
//        return returnTax(price);
//    }

//    public static double returnTax(double price) {
//        return price + price * newTax;
//    }

    public static void main(String[] args) {
        System.out.println(Math.pow(3, 4));
    }
}
