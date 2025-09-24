/**
 Write a program to reverse a given number
 --Get an input from the user and the print the reverse of the given number as the output
 i/p
 567
 o/p
 765
 */

import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int rev=0;
        int num=sc.nextInt();
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.print(rev);
    }
}