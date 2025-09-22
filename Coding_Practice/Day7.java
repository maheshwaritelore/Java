/*Write a program to find number of days in a given month of a given year

--get the number of month and years input from the user and check the number
of days present in that mont

i/p
 Enter month:2
 Enter year :2000

o/p
29

*/

import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Month:");
        int month=sc.nextInt();

        System.out.print("Enter Year:");
        int year=sc.nextInt();

            if(month ==2 && year%400 ==0 ||((year%100!=0)&&(year%4==0)))
            {
                System.out.println("29 day");
            }
            else if(month==2)
            {
                System.out.print(" 28 day");
            }
            else if(month==1 || month==3 ||month==8 ||month== 10||month==12)
            {
                System.out.print(" 31 day");
            }
            else 
            {
                System.out.print("30 day");
            }
        }
            
        
}
    
    
