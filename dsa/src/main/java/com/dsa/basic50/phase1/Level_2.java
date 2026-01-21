package com.dsa.basic50.phase1;

public class Level_2 {
    public static void main(String[] args) {
        // 1). Valid Triangle
        // System.out.println(validTriangle(3, 1, 5) ? "Yes" : "No");

        // 2). Check triangle type
        triangleType(5,5,5);
    }

    private static void triangleType(int i, int j, int k) {
        if(i<=0 || j<=0 || k<=0) System.out.println("0 or less value doesn't make triangle"); 
        else{
            if(i+j>k && j+k>i && k+i>j){
                if(i==j && j==k){
                    System.out.println("Equilateral");
                }else if (i==j || j==k || k==i) {
                    System.out.println("Isosceles Triangle");
                }else{
                    System.out.println("Scalene Triangle");
                }
            }else{
                System.out.println("Not a valid triangle");
            }
        }
    }

    private static boolean validTriangle(int i, int j, int k) {
        if (i <= 0 || j <= 0 || k <= 0) {
            return false;
        } else {
            return i + j > k && j + k > i && k + i > j;
        }
    }
}
