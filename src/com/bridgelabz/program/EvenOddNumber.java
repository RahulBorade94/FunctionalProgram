package com.bridgelabz.program;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        //Variable Declaration
        int number;

        //Scanner Object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number :");
        number = sc.nextInt();

        //Checking for Even or Odd Number using Mod Operator
        if(number % 2 == 0) {
            System.out.println("The Number "+number+" is Even.");
        } else {
            System.out.println("The Number "+number+" is Odd.");
        }
    }

}
