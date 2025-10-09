/**
 * Write aprogram to concatenate a string
 i/p
 Good
 Morning

 o/p
 Good Morning

 */

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String:");
        String str1=sc.nextLine();

        System.out.print("Enter Second String:");
        String str2=sc.nextLine();

        System.out.print("Combine both string:"+(str1+" "+str2));

    }
}
