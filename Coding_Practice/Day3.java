//Write a program to find ASCII values of a character
//Get an input character from the user and the give the ASCII value of the given inpyt as the output

//input b  ,o/p 98
//i/p B    ,o/p 66

import java.util.*;

class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Character:");
        char c=sc.next().charAt(0);
        int i=c;
        System.out.println("The ASCII value of inserted character is "+i);
        
    }
}