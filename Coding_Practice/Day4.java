//Write a program to identify of the a number is positive or negative
//  i/p -10   o/p Negative number
//  i/p  0    o/p neither positive neither negative
//  i/p 15    o/p  positive number

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the number:");

        int num=sc.nextInt();

        if(num>0)
        {
            System.out.println("Positive number");
        }
        else if(num<0)
        {
            System.out.println("Negative Number");
        }
        else{
            System.out.println("neither positive nor negative");
        }
    }
}

// OR

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("Neither negative nor Positive");
        }
        else{
            String output=num>0 ? "Positive number" :"Negative number";
            System.out.println(output);
        }
    }
}