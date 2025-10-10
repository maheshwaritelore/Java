/**
 *Write a program to toggle each character in a string

 Get an input string from user and then convert the lowercase of alphabets to upper case and
 alphabet into lower case

 i/p
 Hello
 o/p
 hELLO
 */
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        String s1 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                s1 = s1 + Character.toLowerCase(ch);  
            } else {
                s1 = s1 + Character.toUpperCase(ch); 
            }
        }

        System.out.println("Toggle String: " + s1);
    }
}
