package com.MyPackage.java;

public class Bubble_Sort {
    void swap(int num[]){
        for (int k=0;k<num.length-1;k++){
            for (int i=0;i<num.length-1-k;i++){
                if (num[i]>num[i+1]){
                    int a=num[i];
                    num[i]=num[i+1];
                    num[i+1]=a;
                }
            }
        }

    }
    void printing(int num[]){
        for(int j=0;j<num.length;j++){
            System.out.print(num[j] +",");
        }
    }
    public static void main(String[]args){
        Bubble_Sort obj1=new Bubble_Sort();
        int num[]={2,4,1,7,3,6,5,0,-67,677};
        obj1.swap(num);
        obj1.printing(num);
    }
}
