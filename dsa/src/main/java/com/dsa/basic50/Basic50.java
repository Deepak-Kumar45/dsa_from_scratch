package com.dsa.basic50;

import java.util.Scanner;

public class Basic50 {

    public static void takeUserInput(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        int num1=scan.nextInt();
        System.out.print("Enter num2: ");
        int num2=scan.nextInt();
        
        scan.nextLine();    // to consume leftover '\n' after reading integer after num2=scan.nextInt();
        System.out.print("Enter string1: ");
        String s1=scan.nextLine();

        System.out.print("Enter string2: ");
        String s2=scan.nextLine();
        System.out.println("num1 = "+num1+", num2 = "+num2);
        System.out.println("string1 = "+s1+", string2 = "+s2);
    }

    public static void checkPositiveNegative(int num){
        if(num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }

    public static void checkEvenOdd(int num){
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        // 1) Take user input (integer, string)
        // takeUserInput();

        // 2) Check positive, negative and Zero
        // checkPositiveNegative(0);

        // 3) Check even and odd
        checkEvenOdd(90);

    }
}
