package com.company;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {


//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++; // ++i, i = i + 1, i += 1
//        }

        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        double y = scanner.nextDouble();
//        if (y >= -3 && y <= 5)

        while (true) {
            System.out.println("Input number [1; 10]:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 1 && number <= 10) {
                break;
            }
        }

//        if (number < 1 || number > 10) {
//            continue;
//        }








    }
}
