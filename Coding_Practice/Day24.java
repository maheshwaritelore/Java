/**
 Write a program to replace all 0's with 1 in a given integer
 i/p
 310020
 o/p
 311121
 */
import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int x=0;
        if(num==0){
            x=1;
        }
        while(num>0){
            int rem=num%10;
            if(rem==0){
                rem=1;
            }
            num=num/10;
            x=x*10+rem;
        }
        num=0;
        while(x>0){
            int r=x%10;
            num=num*10+r;
            x=x/10;
        }
        System.out.println("New number is:"+num);
        
    }
}
