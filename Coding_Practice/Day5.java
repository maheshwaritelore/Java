//Write a program to identify if the number is even or odd
// i/p  10   o/p  Even
// i/p  5    o/p  odd

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");

        int num=sc.nextInt();

        if(num % 2==0)
        {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}

//OR 

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");

        int num =sc.nextInt();

        String result=num%2==0 ? "Even number" : "Odd number";
        System.out.println(result);
    }
}
