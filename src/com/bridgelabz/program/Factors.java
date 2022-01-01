package com.bridgelabz.program;

  /*a. Desc -> Computes the prime factorization of N using brute force.
        b. I/P -> Number to find the prime factors
        c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
        d. O/P -> Print the prime factors of number N.
   */
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Variable Declaration
        int number;
        int temp = 1;

        //Scanner Class Take Input From User
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        number = sc.nextInt();

        //For to get Prime Factor
        System.out.println("The Prime Factors for Numbers "+number+" Are:");
        for ( int i=2; i<=number; i++) {
            if(number % i == 0) {
                temp = 1;
                for (int j=2; j<=i/2; j++) {
                    if(i % j == 0) {
                        temp = 0;
                        break;
                    }
                }
                if(temp == 1) {
                    System.out.println(i +" ");
                }
            }
        }


    }
}
