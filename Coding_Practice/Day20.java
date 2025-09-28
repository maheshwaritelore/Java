/**
 number to word conversion

 ip-55
 op-fifty five

 */
import java.util.*;
class NumberToWord{
    private static final String[] units={
    "","one","two","three","four","five","six","seven","eight","nine",
    "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
    "eighteen","nineteen"
    };

    private static final String[]tens={
        "","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"
    };

    public static String convert(int num){
        if(num==0)return "zero";
        if(num<20)return units[num];
        if(num<100){
            return tens[num/10]+(num%10 !=0 ? " " +units[num % 10]: "");
        }
        if(num<1000){
            return units[num/100]+" hundred"+(num%100 !=0 ? " "+convert(num%100):"");

        }
        if(num<10000){
            return units[num/1000]+" thousand"+ (num % 1000 !=0 ? " "+convert(num%1000):"");
        }
        return "Number too large";
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Input :"+num);
        System.out.println("Output :"+convert(num));

    }
}