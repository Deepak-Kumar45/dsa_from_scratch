package com.dsa.basic50.phase1;

import java.util.Scanner;

public class Level_1 {
    public static void takeUserInput() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();

        scan.nextLine(); // to consume leftover '\n' after reading integer after num2=scan.nextInt();
        System.out.print("Enter string1: ");
        String s1 = scan.nextLine();

        System.out.print("Enter string2: ");
        String s2 = scan.nextLine();
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("string1 = " + s1 + ", string2 = " + s2);
    }

    public static void checkPositiveNegative(int num) {
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void checkEvenOdd(int num) {
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }

    public static void main(String[] args) {
        // 1) Take user input (integer, string)
        // takeUserInput();

        // 2) Check positive, negative and Zero
        // checkPositiveNegative(0);

        // 3) Check even and odd
        // checkEvenOdd(91);

        // 4) Divisible by 5
        // System.err.println(divisibleBy5(212));

        // 5) Divisble by 5 and 3 both
        // System.out.println(divisibleBy5and3(45));

        // 6) check if given year is Leap Year
        // System.out.println(checkLeapYear(1900));

        // 7) Check greater between 2 nums
        // checkGreater(-20, -10);

        // 8) Take 3 numbers and check greater from them
        // checkGreaterFrom3(10, 10,10);

        // 9) Check temperature
        // checkTemperature(16);

        // 10) check vowel and consonent
        // checkVowel('U');

        // 11) Check the character
        checkCharacterType('0');
    }

    private static void checkCharacterType(char ch) {
        if (ch >= 48 && ch <= 57) {
            System.out.println(ch + " is Digit");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println(ch + " is a upper case Letter");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println(ch + " is lower case Letter");
        } else {
            System.out.println(ch + " is a Special character");
        }
    }

    private static void checkVowel(char character) {
        char ch = Character.toLowerCase(character);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is Vowel");
            } else {
                System.out.println(ch + " is Consonent");
            }
        } else {
            System.out.println("Invalid character");
        }
    }

    private static void checkTemperature(int temp) {
        if (temp <= -5) {
            System.out.println("Freezing");
        } else if (temp <= 10) {
            System.out.println("Cold");
        } else if (temp <= 25) {
            System.out.println("Normal");
        } else if (temp <= 40) {
            System.out.println("Warm");
        } else if (temp <= 50) {
            System.out.println("Hot");
        } else {
            System.out.println("Very hot");
        }
    }

    private static void checkGreaterFrom3(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greatest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greatest");
        } else {
            System.out.println(num3 + " is greatest");
        }
    }

    private static void checkGreater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println("Both are equals");
        }
    }

    private static boolean checkLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static boolean divisibleBy5and3(int i) {
        return i % 3 == 0 && i % 5 == 0;
    }

    private static boolean divisibleBy5(int i) {
        return i % 5 == 0;
    }
}
