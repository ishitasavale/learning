package com.ishita;

import java.util.Scanner;

//1 1 2 3 5 8 13..........
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth number of fibonacci series you want to find :");
        int n = in.nextInt();

        int p = 0;
        int ans = 1;
        int count = 2;

        while(count <= n){
            int temp = ans;
            ans = ans + p;
            p = temp;
            count++;
        }
        System.out.println("So the" + n + "th fibonacci series number is = " + ans);

    }
}
