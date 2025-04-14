//check if an array is stored(strictly increasing)

public class Recursion4{
    
     public static boolean isSorted(int arr[] , int index){
        //time complexity= O(n)
        if(index==arr.length-1){
            return true;
        }

        //array is sorted till now
        if(arr[index] >= arr[index+1]){
            return false;
            
        }else{
            return isSorted(arr,index+1);
        }
        
     }
    public static void main(String []args){
    int arr[]={1,3,3};
        
    System.out.println(isSorted(arr ,0));
       
    }
    
}


/* o/p
false
  */