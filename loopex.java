package com.bridgelabz.basics;

public class loopex {

    public static void main(String[] args) {
        int x=2;
       int sum1=x++ + ++x;//2+4=6
       int sum=x++ + ++x + x++ + ++x;//2+4+5+7
       System.out.println(sum);
       System.out.println(x);

    }
}
