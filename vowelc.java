package com.bridgelabz.basics;

public class vowelc {
    static void Vowel_Consonant(char x)
    {
        if (x=='a' || x=='e' || x=='i'|| x=='o'|| x=='u')
            System.out.println("It is Vowel");
        else
            System.out.println("It is Consonant");

    }

    public static void main(String[] args) {
        Vowel_Consonant('m');
        Vowel_Consonant('e');
    }
}
