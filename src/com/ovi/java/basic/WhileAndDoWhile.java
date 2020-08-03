package com.ovi.java.basic;

public class WhileAndDoWhile {
    public static void main(String args[]){
        //while loop
        int x=0;
        while (x<5){
            System.out.println(x);
            x++;
        }
        //do while loop. The loop will always be executed at least once,
        // even if the condition is false, because the code block is executed before the condition is tested:
        int y=0;
        do{
            System.out.println(y);
            y++;
        }
        while(y<0);

    }
}
