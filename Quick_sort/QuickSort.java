public class QuickSort{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }
    public static void quickSort(int arr[] , int low , int high){
        if(low <high){
            int pidx =partition(arr,low,high);

            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static void main(String []args){
        int[]arr={6,5,7,3,4,9};
        int n=arr.length;

        quickSort(arr,0,n-1);

        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

/* op
3 4 5 6 7 9 

notes-
    Time Complexity
    1.woest:O(n^2)->some cases
    2.Average:O(n logn)->all time
*/