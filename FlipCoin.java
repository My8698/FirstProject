package com.bridgelabz.basics;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        int counter = 1;
        double randnum = 0.0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Times will be coin flipped?");
        int flip = scn.nextInt();
        while (counter <= flip) {
            randnum = Math.random();
            System.out.print(counter + "\t" + randnum);
                if (randnum < .5) {
                head++;
                System.out.println("\t Head");
                } else {
                tail++;
                System.out.println("\t Tail");
            }
            counter++;
        }
        System.out.println();
        System.out.println("Number of heads=" + head);
        System.out.println("Number of tailss=" + tail);
      }
}
