package com.ovi.java.basic;

public class JavaArrays {
    public static void main(String args[]){
        String cars []={"volvo", "toyota", "mazda", "BMW"};
        System.out.println(cars[0]);
        cars[3]="Ford";
        System.out.println(cars[3]);
        for (int i=0; i<4; i++){
            System.out.println(cars[i]);
        }
        System.out.println(cars.length);//gives the number of elements in the array
        //for each String element (called i - as in index) in cars, print out the value of i.
        //If you compare the for loop and for-each loop, you will see that the for-each method is easier to write,
        // it does not require a counter (using the length property), and it is more readable.
        for(String j:cars){
            System.out.println(j);
        }
    }
}
