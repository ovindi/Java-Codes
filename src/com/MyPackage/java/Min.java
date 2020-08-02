package com.MyPackage.java;

import java.util.Scanner;
public class Min {
    public static void main(String args[]){
        int n,min;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        min=a[0];
        for (int i=0; i<n; i++){
            if (min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("The smallest number is:"+min);


    }
}
