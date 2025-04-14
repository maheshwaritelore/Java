//Print a string in reverse

public class Recursion2{
    public static void printRev(String str ,int index){
//time complexity= O(n)
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        
        System.out.print(str.charAt(index));
        printRev(str, index-1);
        
       
    }
    public static void main(String []args){
    String str= "Maheshwari";
        
    printRev(str, str.length()-1);

    }
}

/* o/p
irawhsehaM
  */