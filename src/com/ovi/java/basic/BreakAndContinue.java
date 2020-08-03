package com.ovi.java.basic;

public class BreakAndContinue {
    public static void main (String args[]){
        for (int i=0; i<10; i++){
            if (i==4){
                break;
            }
            System.out.println(i);
        }
        for (int j=0; j<10; j++){
            if (j==4){
                continue; //The continue statement breaks one iteration (in the loop), if a specified condition occurs,
                // and continues with the next iteration in the loop.This example skips the value of 4:
            }
            System.out.println(j);
        }
        int z=0;
        while (z<10){
            if (z==5){
                break;
            }
            System.out.println(z);
            z=z+1;
        }
        int x=0;
        while(x<10){
            if(x==6){
                x++; //If I don't have x++ here, my loop will go inside the if condition
                //when x=6. But, won't increment.
                continue;
            }
            System.out.println(x);
            x++;
        }

    }
}
