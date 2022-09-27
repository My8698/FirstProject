package com.bridgelabz.basics;

import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        int b,e;
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the base:");
        b=scn.nextInt();
        System.out.print("Enter the exponent:");
        e=scn.nextInt();
        double power=Math.pow(b,e);
        System.out.println(b + "to the power" +e+ "is:" +power);
    }
}
