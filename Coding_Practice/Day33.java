/**
 Write a string to Remove vowel from a string

 GEt a string as the input from the user and then remove all the vowel letter
 from the string and give the output

 i/p
 remove
 o/p
 rmv
 */
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine();
        String s1="";
        s1=str.replaceAll("[aeiou]","");
        System.out.print("Removed string:"+s1);
    }
}