/**
 * Write a program to print length of the string without using strlen()function
 
 Get a string as input from user and print the length of string without using strlen()
 function.

 i/p
 Hello
 o/p
 5
 */

import java.util.*;
class Main{
    public static void main(String[]args){
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine();

        char ch[]=str.toCharArray();
        for(char c:ch){
            i++;
        }
        System.out.print("string length:"+i);
    }
}