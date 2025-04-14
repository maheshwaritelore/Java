//print all the subset of a set of first n natural numbers
import java.util.*;
public class Recursion5{
    public static void  printSubset(ArrayList<Integer> subset){
        //time complexity=O(2^n)
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void  findSubsets(int n ,ArrayList<Integer> subset ){
        if(n==0){
            printSubset(subset);
            return ;
        }
    
        //add hoga
        subset.add(n);
        findSubsets(n-1,subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1 ,subset);
        
    }
    public static void main(String[]args){
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubsets(n,subset);
        
    }
}

/*
3 2 1 
3 2
3 1
3
2 1
2
1
*/