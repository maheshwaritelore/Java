import java.util.*;
public class str1{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Mahi");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //Insert
        sb.insert(0,"S");
        System.out.println(sb);

        //Delete
        sb.delete(2,3);
        System.out.println(sb);

        //Append
        sb.append("i");
        sb.append("i");
        sb.append(" ");
        sb.append("T");
        sb.append("e");
        System.out.println(sb);
        System.out.println(sb.length());


    }
}