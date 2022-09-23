package com.bridgelabz.basics;

public class largestno {
    public static void main(String[] args) {
        int a,b,c,large;
        a=100;
        b=400;
        c=150;

        large=bigofthree(a,b,c);
        System.out.println(large + " is the largest number among three");
    }
    static int bigofthree(int x,int y,int z)
    {
        if (x>=y && x>=z)
            return x;
            else if(y>=x && y>=z)
                return y;
            else
                return z;
    }
}
