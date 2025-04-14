import java.util.*;
class Selection_sort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){  //n-1
    int arr[]={7,8,4,5,3};
    //time complexity=0(n^2)
    //Selection sort

    for(int i=0;i<arr.length-1;i++){
        int smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                //swap
                int temp=arr[smallest];
                arr[smallest]=arr[j];
                arr[j]=temp;
            }
        }
    }
    printArray(arr);
}

}

//o/p  3 4 5 7 8 

