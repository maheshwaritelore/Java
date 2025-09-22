//Take an input character from user and check whether it is an alphabet or not
import java.util.*;
class main{
    public static void main(String[]args){
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        c=sc.next().charAt(0);

        if((c >= 'a' && c<='z') || (c >='A' && c <='Z'))
        {
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not an alphabet");
        }

    }
}