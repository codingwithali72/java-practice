package com.ali.java;

public class Loops {
    public static void main( String[] args ) {
        int n= 4324658;
        int digits=0;
        while(n>0){
            n=n/10;
            digits++;
            System.out.println(digits);
        }
}
}
