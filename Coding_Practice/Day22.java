/**
 Write a code to identify if the number is palindrome or not
---get a number as input from the user and check whether that number is palindrome or not

i/p
121
o/p
palindrome

34
not a palindrome

 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int rem,copy;
        int rev=0;
        copy=num;

        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==copy)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}