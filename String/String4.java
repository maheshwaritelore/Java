import java.util.*;
public class String4{
    public static void main(String[]args){
        //compare

        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2=sc.nextLine();
        
        if(str1.compareTo(str2)==0){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
        
    }
}