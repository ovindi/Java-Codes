package com.ovi.java.Methods;

//Over loading is to have same name for methods but with different parameters
//In over loading, there's noting to do with the return type. In this, I have both int and double as return types.
public class OverLoading {
    static int add(int x, int y){
        return x+y;
    }
    static double add (double x, double y){
        return x+y;
    }
    public static void main (String args[]){
        int z = add(3,4);
        System.out.println(z);
        double x = add(3.5,6.4);
        System.out.println(x);
    }
}
