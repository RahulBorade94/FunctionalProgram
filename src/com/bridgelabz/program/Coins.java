package com.bridgelabz.program;



public class Coins {
    public static void main(String[] args) {
        System.out.println("Program for Counting the Percentile of Head and Tail");

        //Variables declaration
        int h_c = 0;
        int t_c = 0;

        for(int i=1; i<=10; i++) {

            //Generating Random Flip of Coin
            double coinFlip =  (Math.random()*10) % 1;

            System.out.println("Coin Flip Values ="+coinFlip);

            //Counting the Head and Tail
            if(coinFlip < 0.5) {
                h_c++;
            } else {
                t_c++;
            }
        }

        //Print Head & Tail Counts
        System.out.println("TailCount:"+t_c);
        System.out.println("HeadCount:"+h_c);

        //Calculating Percentage of Head vs Tail
        int PercentTail = (t_c * 100) / 10;
        int PercentHead = (h_c * 100) / 10;

        //Printing Percentage of Head vs Tail
        System.out.println("The Percentage of Tails is : " + PercentTail);
        System.out.println("The Percentage of Heads is : " + PercentHead);

          }
}
