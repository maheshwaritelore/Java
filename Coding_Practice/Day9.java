/*Writing a program to find Number of digits in an integer
--take an integer as the user and then calculate the number of digits in the given
input and print it as the output

i/p
3241
o/p
4

i/p
6
o/p
1

 */
import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter in an integer:");

        int num=sc.nextInt();
        int count=0;
        if(num==0)
        {
            System.out.print("Number of digits =1");

        }
        else
        {
            while(num !=0)
            {
                count++;
                num=num/10;
            }
            System.out.print("Number of digits is:="+count);
    
        }
    }
}