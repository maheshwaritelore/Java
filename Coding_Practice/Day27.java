/**
 Write a program to calculate maximum number of handshake

 get the number of people in the room as input from the user. then claculate the maximum
 number of handshake possible among that people

if there N people in the room then the first person has to shake hand with
N-1 people and second person has to shake hand with N-1-1 people ie.N-2 handshakes
are possible .Thus, it goes on.
so thtle handshake =N-1+N-2+N-3+.....+1+0

i/p
10

o/p
45
 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of people in the room:");
        int num=sc.nextInt();

        int totle=num*(num-1)/2;
        System.out.println("Totle number of handshake ="+totle);

    }
}