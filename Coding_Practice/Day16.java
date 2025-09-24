/**
 * Write a program to identify if the number is perfect number or not
 
--get the in[put from the user and check whether that number is a perfect number or not.
eg. ler number is 28, factor of 28=1,2,4,7,14
now the sum of all these factor are 28 itself

i.p
28
o/p
perfect number

i/p
4
o/p
not a perfect number
 */

import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter The Number:");
        int num=sc.nextInt();
        
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }    
        }
        if(num==sum)
        {
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}