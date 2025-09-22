/* write a program to find the quadrants in which coordinates lie
Get the value of x and y coordinates as input from the user and check in which
quadrant the point lie and print it

i/p  10  20
o/p   this point lie between first quadrant

ie (++) ->first quad.
    (-+) ->second quad.
    (+-) ->third quad.
    (--) ->fourth quad.
*/

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of X axis:");
        int x=sc.nextInt();
        
        System.out.print("Enter the value of Y axis:");
        
        int y=sc.nextInt();

        if(x>0 && y>0)
        {
            System.out.println("This point lie in the First quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("This point lie in the Second quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("This point lie in the Third quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("This point lie in the fourth quadrant");
        }
        else if(x==0 && y==0){
            System.out.println("This point lie in the Origin");
        }
        else{
            System.out.println("not valid values");
        }
    }
}