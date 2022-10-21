package com.bridgelabz.basics;
import java.util.Scanner;
public class vowelc {
    static void Vowel_Consonant(char x)
   // class Char
    {
        if (x=='a' || x=='e' || x=='i'|| x=='o'|| x=='u' || x=='A' || x=='E' || x=='I' ||x=='O' ||x=='U')
            System.out.println("Entered character is vowel");
        else
            System.out.println("It is Consonant");
    }
    public static void main(String[] args) {
        //int i=0;
        //Scanner scn=new Scanner(System.in);
        //System.out.println("Enter character:");
        //char x=scn.next().charAt(0);
        Vowel_Consonant('U');
        Vowel_Consonant('A');
    }
}
