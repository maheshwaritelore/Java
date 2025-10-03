/*
Write a program to print pyramid pattern using stars
i/p
4
o/p
              *
            * * *
          * * * * *
        * * * * * * * 
*/
import java.util.*;
class Main{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number:");
      int rows=sc.nextInt();
      int i,j,k;
      for(i=1;i<=rows;i++)
      {
        for(j=i;j<rows;j++)
          System.out.print(" ");
        
        for(k=1;k<=(2*i-1);k++)
          System.out.print("*");
        
        System.out.println("");
      }
     
    }
}