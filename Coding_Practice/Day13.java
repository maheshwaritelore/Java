/*Write a program to find sum of N natural numbers
i/p 5
o/p 15
explain- 1+2+3+4+5=15
*/

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Natural number:");

        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum=sum+i;
            System.out.println(sum);
        }
    }
}