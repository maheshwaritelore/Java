/**
 Write a program to identify if the number is Strong number or not
 -- eg
 145
 1!=1
 4!=24
 5!=120

 1+24+120=145

 this is a strong number
 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        int fact=1;
        int rem;
        if(num==0){
            sum=sum+fact;
        }
        else{
            while(copy!=0)
            {
                rem=copy%10;
                fact=1;
                for(int i=1;i<=rem;i++){
                    fact=fact*i;
                }
                sum=sum+fact;
                copy=copy/10;
            }
        }
        if(sum==num){
            System.out.println("Strong number");

        }
        else{
            System.out.println("Not a strong number");
        }
    }
    
}