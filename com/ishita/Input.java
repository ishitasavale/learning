package com.ishita;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int rollno = input.nextInt();
//        System.out.println("Your roll no is" + rollno );
//    }
          char ch = in.next().trim().charAt(0);
//        System.out.println(ch.charAt(3));

          if(ch >= 'a' && ch <= 'z'){
              System.out.println("Lowercase");
          }
          else{
              System.out.println("Uppercase");
          }
    }
}
