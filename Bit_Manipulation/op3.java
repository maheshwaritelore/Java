import java.util.*;
public class op3{
    public static void main(String[]args){
        //clear bit
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask=~(bitmask);

        int newNumber=notbitmask & n;
        System.out.println(newNumber);
    }
}