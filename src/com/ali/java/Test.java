package com.ali.java;

public class Test {
    public static void main(String[] args) {
        String a = new String("ali");
        String b = new String("ali");
        String c = "ali";
        String d = "ali";
        System.out.println(a == c);
        System.out.println(b == d);
    }
}