import java.util.*;
public class Butterfly{
    public static void main(String []args)
    {
        int n=5;
        //upper part
        for(int i=1;i<=n;i++)
        {
            //first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            //space
            int spaces=2*(n-i);
            for(int j=1 ; j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        //for(int i=n;i>=1;i--)

        for(int i=n;i>=1;i--)
        {
            //first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            int spaces=2*(n-i);
            for(int j=1 ; j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

           
    }
}
/*

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        * 

 */