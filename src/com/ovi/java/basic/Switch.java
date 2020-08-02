package com.ovi.java.basic;
import java.util.Scanner;

public class Switch {

    public static void main(String args[]){
        int z, x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("Select a number from 1,2,3,4");
        z=s.nextInt();
        System.out.println("Enter number 1");
        x=s.nextInt();
        System.out.println("Enter number 2");
        y=s.nextInt();
        switch(z){
            case 1:
                System.out.println("sum="+(x+y));
                break;
            case 2:
                System.out.println("difference="+(x-y));
                break;
            case 3:
                System.out.println("Multiplication="+(x*y));
                break;
            case 4://you can use default here to run the division process to any number other than 1,2 or 3.
                System.out.println("Division="+(x/y));
        }
    }
}
