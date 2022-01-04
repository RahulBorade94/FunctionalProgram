package com.bridgelabz.functional.program;

public class Distance {
    public static void main(String[] args) {
        //Variable Declaration
        int x, y;
        double Distance = 0.0;

        //Accepting Command Line Argument in x and y
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        System.out.println("The Value for Point X : " + x);
        System.out.println("The Value for Point Y : " + y);

        //Calculating the Euclidena Distance using Math.sqrt() and Mth.pow()
        Distance = Math.sqrt( Math.pow(x,x) + Math.pow(y,y) );

        System.out.println("Euclidean Distance : "+ Distance);

    }
}
