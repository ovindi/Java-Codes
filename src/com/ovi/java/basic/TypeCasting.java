package com.ovi.java.basic;

public class TypeCasting {
    public static void main(String args[]){
        //widening casting (This is done automatically when parsing a smaller size type to a larger size type)
        int myInt=2;
        double myDouble=myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
        //narrowing casting (This is done manually when parsing a larger size type to a smaller size type)
        double myDoubleNew=2.75;
        int myIntNew=(int) myDoubleNew;
        System.out.println(myDoubleNew);
        System.out.println(myIntNew);

    }
}
