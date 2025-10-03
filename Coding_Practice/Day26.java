/**
 * Write a program to find area of a circle
 --get the value for radius from the user and calculate the area of the circle for the given
 radius.

 Area of circle=3.14*radius*radius

 i/p
 3
 o/p
 28.26

 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the redius:");
        float redius=sc.nextFloat();
      
        double area=3.14 * redius * redius;
        System.out.print(area);

    }
}