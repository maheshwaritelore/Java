/**
 Write a program to find factorial of a number

 -- get a number from user for which you need to find the factorial,then claculate the factorial and
 give it as the output

 i/p
 4

 o/p
 24

 */
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int num=sc.nextInt();
        int fact=1;
        if(num<0){
            System.out.println("Invalid Input");
        }
        for(int i=1;i<=num;i++)
            fact=fact*i;
        System.out.println("Factorial is :"+fact);
    }
}