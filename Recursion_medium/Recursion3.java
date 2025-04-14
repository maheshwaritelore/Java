//find the 1st and last occurance of an element of an element in string

public class Recursion3{
    public static int first= -1;
     public static int last= -1 ;
     public static void findOccurance(String str , int index , char element){
        //time complexity= O(n)
        if(index==str.length()){
            System.out.println(first);
             System.out.println(last);
            return;
        }
        char currChar =str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first =index;
            }else{
                last =index;
            }
        }
        findOccurance(str , index+1 ,element);
     }
    public static void main(String []args){
    String str= "sdsdrdfedsedrsed";
        
    findOccurance(str,0 ,'s');
       
    }
    
}


/* o/p
0
13
  */