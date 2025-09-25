/*
Write a program to add two factors
--get the value for numerator and denominator of two fractions,then add that fractions.
consider the following format

x3/y3=(x1/y1)+(x2/y2)
here x3=(x1*y2)+(x2*y1)
and y3=(y1*y2)

input
2  3
4  3
output
2/1

 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value for x1 and y1:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.print("enter value for x2 and y2:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        int Div;
        int x3=(x1*y2)+(x2*y1);
        int y3=y1*y2;

        if(x3>y3)
        {
            Div=y3;
        }
        else{
            Div=x3;
        }
        for(int i=Div;i>0;i--)
        {
            if(x3%i==0 && y3%i==0)
            {
                x3=x3/i;
                y3=y3/i;
            }
        }
        System.out.print("Sum of fractions is :"+x3+"/"+y3);
    }
}