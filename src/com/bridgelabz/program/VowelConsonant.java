package com.bridgelabz.program;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        //Variable Declaration
        char ch;

        //Scanner Object for User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Character :");
        ch = sc.next().toLowerCase().charAt(0);   //Taking Input and Convert it to Lowercase after that get First Char in variable

        //Checking for Character is Vowel or Consonant
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonant");
        }
    }

}
