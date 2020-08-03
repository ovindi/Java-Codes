package com.ovi.java.basic;

public class ForLoop {
    public static void main (String args[]){
        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.
        for (int i=0; i<5; i++){
            System.out.println(i);
        }
        //to output the even numbers between 0 and 10
        for (int j=0; j<10; j=j+2){
            System.out.println(j);
        }
        /*There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        for (type variableName : arrayName) {
        // code block to be executed}*/
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
