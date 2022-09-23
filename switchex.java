package com.bridgelabz.basics;

import java.util.Scanner;

public class switchex {

    static void m(char x){

        switch (x){
            case 'A':
                System.out.println("First case");
                break;
            case 'B':
                System.out.println("Second case");
                break;
            case'C':
                System.out.println("Third case");
                break;
            default:
                System.out.println("Default");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter choice(A-Z)");
        char ch=scn.next().charAt(0);
        m(ch);

    }
}
