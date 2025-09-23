/**
Write a program to find sum of digits of a number
-- Get a number from user and then find the sum of the digits in given number
i/p 341
o/p 8

 */
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");

        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.print(sum);
    }
}