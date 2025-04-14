import java.util.*;
public class op4{
    public static void main(String[]args){

    //update bit

    Scanner sc=new Scanner(System.in);
    int oper=sc.nextInt();
    //oper=1:set oper=0 :clear
    int n=5;
    int pos=2;

    int bitmask=1<<pos;
    if(oper==1){
        //set
        int newNumber=bitmask|n;
        System.out.println(newNumber);
    }
    else{
        //clear
        int newbitmask=~(bitmask);

        int newNumber=newbitmask & n;
        System.out.println(newNumber);
    }
        
    }
}