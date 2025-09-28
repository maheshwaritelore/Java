/*
write a program to identify if the number is Armstrong number or not
eg-
Here 1^4+6^4+3^4+4^4=1634
the number is armstrong number

 */

import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int num=sc.nextInt();
        int copy=num;
        int result=0;
        int n=0;
        int rem;
        while(num!=0)
        {
            num/=10;
            num++;
        }
        num=copy;
        while(num!=0)
        {
            rem=num%10;
            int mul=1;
            
            for(int i=1;i<=n;i++)
            {
                mul=mul*rem;
                    
            }
            result=result+mul;
            num/=10;
        {
            System.out.println("Armstrong Number");
        }
        else
        {
                System.out.println("Not Armstrong number");
        }
            
        
    }
}