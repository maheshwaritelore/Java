import java.util.*;
class Insertion_sort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){  //n-1
    int arr[]={7,8,4,5,3};
    //time complexity=0(n^2)
    //Insertion sort

    for(int i=1;i<arr.length;i++){
        int current=arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        //placement
        arr[j+1]=current;
        
    }
    printArray(arr);
}

}

//o/p  3 4 5 7 8 

