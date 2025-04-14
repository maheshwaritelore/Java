import java.util.*;
public class str2{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Mahi");
        System.out.println(sb);

        //Reverse string

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
        

    }
}