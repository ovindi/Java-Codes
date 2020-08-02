package com.ovi.java.basic;

public class JavaStrings {
    public static void main(String args[]){
        String string01="I_am_sleepy_chuti_maama;(";
        String string02="My_back_pains";
        String string03="Period sucks";
        //length of the string
        System.out.println(string01.length());
        //to uppercase
        System.out.println(string01.toUpperCase());
        //to lowercase
        System.out.println(string01.toLowerCase());
        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        //Java counts positions from zero. 0 is the first position in a string, 1 is the second, 2 is the third ...
        System.out.println(string01.indexOf("chuti"));
        //String concatenation
        System.out.println(string02+" "+string03);
        //You can also use the concat() method to concatenate two strings:
        System.out.println(string02.concat(string03));
        /*Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
        The sequence \"  inserts a double quote in a string:
        The sequence \'  inserts a single quote in a string:
        The sequence \\  inserts a single backslash in a string:
         */
        String string04="I want to go \"out\"";
        String string05="Take me \'somewhere\'";
        String string06="Take me \\somewhere";
        System.out.println(string04);
        System.out.println(string05);
        System.out.println(string06);

        //using \n, \r, \b, \t
        System.out.println("Hello\nWorld");
        System.out.println("Hello\bWorld");
        System.out.println("Hello\tWorld");
        System.out.println("Hello\rWorld");

    }
}
