package com.ovi.java.basic;
import java.util.Scanner;

public class IfElse {
    public static void main(String args[])
    {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        n=s.nextInt();
        if (n>10){
            System.out.println("greater than 10");
        }
        else if (n==10){
            System.out.println("Equal to 10");
        }
        else{
            System.out.println("less than 10");
        }
    }
    }
