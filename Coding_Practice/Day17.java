/**
 Write a program to find the factors of a number
 --Description
 get an input from the user and find the factors of the number
 i/p
 4
 o/p
 1,2,4
 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}