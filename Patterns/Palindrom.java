import java.util.*;
public class Palindrom{
    public static void main(String []args){
        int n=5;
         for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd half numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
         }
    }
}

/*
    11
   2112
  321123
 43211234
5432112345

*/