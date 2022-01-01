package com.bridgelabz.program;
        //a. Desc -> This program takes a command-line argument N and prints a table of the
        //powers of 2 that are less than or equal to 2^N.
        //b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
        //c. Logic -> repeat until i equals N.
        //d. O/P -> Print the year is a Leap Year or not.

public class PowerTwo {
    public static void main(String[] args) {
        //Accepting Command Line Argument Value in Variable
        int n = Integer.parseInt(args[0]);

        System.out.println("Number for Power : "+n);

        //Checking for Validation of Power No
        if( n <= 0 || n > 31) {
            System.out.println("The Power Number must be Greater Than Zero and Less Than 31");
        } else {
            //Repeat until i less than or equals to N
            for(int i=1; i<=n; i++) {
                //Use Math Power Function to calculate the Power of Number
                int powerOfNo = (int) Math.pow(2,i);
                System.out.println(powerOfNo);
            }
        }


    }
}
