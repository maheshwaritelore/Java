/**
 Write a program to find fibonacci series up to n

 --fibonacci series is a special series where nth term is the sum of previous two terms in
 the series.the series with 0 and 1 as the first and second term of the series respectively

 i/p
 5
 o/p
 0,1,1,2,3

 i/p
 8
 o/p
 0,1,1,2,3,5,8


 */
import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");

        int num =sc.nextInt();
        if(num>0){
            int a=0,b=1,c;
            System.out.print("Fibonacci series:"+a+","+b+",");
            while(b<num){
                c=a+b;
                a=b;
                b=c;
                if(b<=num){
                    System.out.print(b+",");
                }
            }
        }
        else{

            System.out.print("Invalid input");
        }
    }
}