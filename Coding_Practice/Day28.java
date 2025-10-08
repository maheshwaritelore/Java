/**
 * write a program to find the double of the given number without using arithmatic operator
 
 For the given input number calculate the double of it without using arithmatic operator

 i/p
 4
 o/p
 8

 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        System.out.println(num<<1);
    }
}