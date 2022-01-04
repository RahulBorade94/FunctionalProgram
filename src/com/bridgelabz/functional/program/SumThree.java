package com.bridgelabz.functional.program;

import java.util.Scanner;

public class SumThree {
    public static void main(String[] args) {
        //Array and Variable Declaration
        int[] arr;
        int n, i, j, k;
        int tripletCount = 0;

        //Scanner Object for User input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array :");
        n = sc.nextInt();

        //Initailizing the Array by given Number of elements
        arr = new int[n];

        //Taking array element input from user
        System.out.println("Enter the "+n+" Numbers in Array :");
        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Checking for the Triplet which sum add to zero
        for(i = 0; i<n-2; i++) {
            for(j = i+1; j<n-1; j++) {
                for(k = j+1; k<n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0 ) {
                        System.out.println("(" + arr[i] +","+ arr[j] +","+ arr[k] +")");
                        tripletCount++;
                    }
                }
            }
        }

        System.out.println("Total Triplet Counts :"+ tripletCount);

    }
}
