package com.ishita;


import java.util.Scanner;
public class Quesinloops {
//    public static void main(String[] args){
//        //count occurence of digit n in a number
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a positive integer :");
//        int n = in.nextInt();
//        System.out.print("Enter digit u want to count :");
//        int d = in.nextInt();
//
//        //n%10 = last digit of a number
//
//        int count =0;
//        while(n>0){
//            int rem = n%10;
//
//            if(rem==d){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println("The number of times --> " + d +" occured is = " + count );
//
//
//    }
//
//
//
//
//}
public static void main(String[] args){
    //reverse a number
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a positive integer :");
    int n = in.nextInt();

    int ans = 0;

    //n%10 = last digit of a number
    //d*10+d=dd - forming reverse string of numbers


    while(n>0){
        int rem = n%10;
        n = n/10;
        ans = ans * 10 + rem;


    }
    System.out.println("The reversed number is--> " +  ans);


}




}
