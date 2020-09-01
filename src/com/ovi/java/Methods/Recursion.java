package com.ovi.java.Methods;

public class Recursion {
    public static void main (String args[]){
    int z =sum(10);
    System.out.println(z);
    }
    static int sum (int i){
        if (i>0) {
            return (i+sum(i-1));
        }
        else {
            return 0;
        }

    }
}

/*10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 */
