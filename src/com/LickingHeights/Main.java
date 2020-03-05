package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        lastDigit();
    }
    public static void lastDigit() {
        int number = 2999;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Give Me A Positive Number 4 digits");
        number = keyboard.nextInt();

        System.out.println("The last number is: "+ number%10);
    }
}
