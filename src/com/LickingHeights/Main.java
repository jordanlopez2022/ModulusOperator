package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
    }
    public static void testOddness(){
        int number = 17;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Give Me A Positive Number");
        number = keyboard.nextInt();

        System.out.println("Number is even: "+ (number % 2 ==0));
        System.out.println("Number is odd: "+ (number % 2 !=0));
    }
}
