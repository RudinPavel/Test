package com.company;

import java.util.Scanner;

public class Main {

    public static int field;

    public static void func(int x, String y, double z){

    }

    public static int readNumberFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input next number: ");
        String holder = scanner.nextLine();
        int number = Integer.parseInt(holder);
        return number;
    }

    //public static int readNumberFromKeyboard(String title);
    // декларация функция, реализация функции, вызов функции

    // сигнатура
    //int readNumberFromKeyboard(String);
    //int readNumberFromKeyboard();
    //int readNumberFromKeyboard(int);

    public static void procedure(int a, String b, double c){
        System.out.println("Hello, world!");
        return;
    }


    public static int readNumberFromKeyboard(String title, int i) { //формальное имя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + title + ": " + i);
        String holder = scanner.nextLine();
        int number = Integer.parseInt(holder);
        return number;
    }

    public static int readNumberFromKeyboard(int i, String title) { //формальное имя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + title + ": " + i);
        String holder = scanner.nextLine();
        int number = Integer.parseInt(holder);
        return number;
    }

    public static void main(String[] args) {

        final float myFloat;
        myFloat = 10f;

        final float myFloat2 = 30f;

        String x = "i1"; // фактическое имя
        String y = "i1"; // фактическое
        String z = "i1"; // фактическое
        int i1 = readNumberFromKeyboard(10, x);
        int i2 = readNumberFromKeyboard();

        int a = readNumberFromKeyboard(); // 3 ч + 1 мс
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        System.out.println(readNumberFromKeyboard());
        System.out.println(readNumberFromKeyboard());
        System.out.println(readNumberFromKeyboard());
        
        //int i3 = readNumberFromKeyboard(z);
    }
}
