package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        keepContained();
    }
    public static void keepContained() {
        int number = 357;
        System.out.println((number%5)+1);
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Give Me A Positive Number");
        number = keyboard.nextInt();

        number = 1;
        System.out.println((number%5)+1);

        number = 2;
        System.out.println((number%5)+1);

        number = 3;
        System.out.println((number%5)+1);

        number = 4;
        System.out.println((number%5)+1);

        number = 5;
        System.out.println((number%5)+1);

        number = 6;
        System.out.println((number%5)+1);

        number = 7;
        System.out.println((number%5)+1);

        number = 8;
        System.out.println((number%5)+1);

    }
}
