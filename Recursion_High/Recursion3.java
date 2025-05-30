//place tiles of size 1xm in a floor of size nxm
public class Recursion3{
    public static int  placeTiles(int n ,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
              return 1;  
        }
        //vertically
        int vertPlacements=placeTiles(n-m,m);

        //Horizontally
        int horPlacements=placeTiles(n-1,m);
        return vertPlacements+horPlacements;
        
    }
    public static void main(String[]args){
        int n=3,m=8;
        
        System.out.println(placeTiles(n,m));
    }
}

/*
1
*/