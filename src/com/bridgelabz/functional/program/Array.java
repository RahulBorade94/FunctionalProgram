package com.bridgelabz.functional.program;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//Array and Variable Declaration
        int[][] arr;
        int m, n, r, c;

        //Scanner Object for User Input
        Scanner sc = new Scanner(System.in);

        //Taking Runtime values for Rows and Columns from User
        System.out.println("Entre the Value of Rows for Array :");
        m = sc.nextInt();
        System.out.println("Enter the Value of Columns for Array :");
        n = sc.nextInt();

        //Initializing Array with given Rows and Column Values
        arr = new int[m][n];

        //Taking Array input from user
        System.out.println("Enter the Values in "+m+" x "+n+" Array Matrix:");
        for(r = 0; r < m; r++) {
            for(c = 0; c < n; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        //Showing the Array Values in Matrix Form
        System.out.println("The Values in "+m+" x "+n+" Array Matrix are :\n");
        for(r = 0; r < m; r++) {
            for(c = 0; c < n; c++) {
                System.out.print("\t"+ arr[r][c]);
            }
            System.out.print("\n");
        }

    }
}
