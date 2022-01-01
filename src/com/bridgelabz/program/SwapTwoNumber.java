package com.bridgelabz.program;
//Java Program to Swap Two Numbers
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        //Variable Declaration
        int a,b,c;

        //Scanner Class Object for Taking User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value for A :");
        a=sc.nextInt();
        System.out.println("Enter the Value for B :");
        b=sc.nextInt();

        System.out.println("Value of A and B Before Swapping");
        System.out.println("A : " + a + "\t" + "B : " + b);

        //Performing Sqpping logic using 3 Variables
        c = a;
        a = b;
        b = c;

        System.out.println("Values of A and B After Swapping");
        System.out.println("A : " + a + "\t" + "B : " + b);


    }
}
