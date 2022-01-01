package com.bridgelabz.program;
         //a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
        //b. I/P -> The Harmonic Value N. Ensure N != 0
        //c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
        //d. O/P -> Print the Nth Harmonic Value.
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        //Scanner Object for Taking Input from User
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Harmonic Value : ");
        int harmonicNo = sc.nextInt();
        double total = 0;

        //Repeat until the Harmonic Sequence complete
        for(int i=1; i<=harmonicNo; i++) {
            total += (double) 1/i;
            System.out.print("1/"+i+"+");
        }

        System.out.println("\nTotal of Harmonic Number :"+ total);

    }
}
