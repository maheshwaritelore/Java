/**
 * Write a program to reverse a string
 
 Get an input string from user and print it in reverse order

 i/o
 Hello
 o/p
 olleH
 */

import java.util.*;
class Main{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str1=sc.nextLine();
        String str2=" ";

        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
            
        }
        System.out.println("Reversed string:"+str2);
    }
}