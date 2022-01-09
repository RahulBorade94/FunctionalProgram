package com.bridgelabz.program;

import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        //Variable Declaration
        int a, b, c;

        //Scanner Object for User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 Numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //Checking for the Largest Value using nested if-else
        if(a > b) {
            if(a > c) {
                System.out.println("The Value of A is Large");
            } else {
                System.out.println("The Value of C is Large");
            }
        } else {
            if(b > c) {
                System.out.println("The Value of B is Large");
            } else {
                System.out.println("The Value of C is Large");
            }
        }
    }

}
