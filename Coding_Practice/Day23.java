/**
 Write a program to exprss a number as a sum of two prime numbers
 ---get a number as imput from the user and express that number as sum of two prime numbers
 i/p
 4
 o/p
 4 can be expressed as sum of 2 and 2
 */

import java.util.*;
class Main{
    static int sumprimes(int n)
    {
        int i,isPrime=1;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=0;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int flag=0;

        for (i=2;i<=num/2;++i){
            if(sumprimes(num-i)==1){
                System.out.println(num+"can be expresses as the sum of"+i+"and"+(num-i));
                flag=1;
            }
        }
    }
    if(flag == 0){
        System.out.println(num+"cannot be expressed as the sum of two primes");
    }    
}