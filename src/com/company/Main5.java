package com.company;

import java.io.File;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Test1";
        cat1.age = 10;

        Cat cat2 = new Cat();
        cat2.name = "Test2";
        cat2.age = 15;

        System.out.println(Cat.countLife);
        printCat(cat1);
        printCat(cat2);

//        abs(10);
//        Main5 main5 = new Main5();
//        main5.abs(10);

//        int o = 10;
//        Scanner scannerFromConsole = new Scanner(System.in);
//        Scanner scannerFromFile = new Scanner(new File("path"));
//        scannerFromFile.nextLine();
    }

    public int abs(int number) {
        return number > 0 ? number : (number * (-1));
    }

    public static void printCat(Cat cat) {
        System.out.println("Name = "
                + cat.name + ", age = " + cat.age
                + ", lifeCount = " + Cat.countLife);
    }
}
