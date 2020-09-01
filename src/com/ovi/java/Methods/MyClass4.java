package com.ovi.java.Methods;
import java.util.Scanner;

public class MyClass4 {
    static void checkAge(int age){
        if (age<18){
            System.out.println("Access denied - You are not old enough");
        }
        else{
            System.out.println("Access granted - You are allowed");
        }
    }
    public static void  main (String args []){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your birth year");
        int n= s.nextInt();
        checkAge(2020-n);


    }
}
