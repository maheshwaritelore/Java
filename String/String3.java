import java.util.*;
public class String3{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        String first_name= sc.nextLine();
        String last_name=sc.nextLine();
        String full_name=first_name+" "+last_name;

         //String length
        System.out.println(full_name.length());

        //charAt
        for(int i=0;i<full_name.length();i++)
        {
            System.out.println(full_name.charAt(i));

        }
        
    }
}