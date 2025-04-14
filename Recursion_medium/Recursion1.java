//Tower of Hanoi
//Rule 1.only one disc transferred 1 step 
//     2.smaller disks are slowly kept on top of larger disks

class Recursion1{
    public static void towerOfHanoi(int n,String src , String helper , String dest){
//time complexity= t(n)=2T(n-1)+2
        if(n==1){
            System.out.println("Transfer disk "+ n+ "from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src , dest ,helper);
        System.out.println("Transfer disk "+ n+ "from "+src+" to "+dest);
        towerOfHanoi(n-1 , helper, src, dest);
        
       
    }
    public static void main(String []args){
    int n=3;
        
    towerOfHanoi(n ,"S" ,"H","D");

    }
}

/* o/p
Transfer disk 1from S to D
Transfer disk 2from S to H
Transfer disk 1from D to H
Transfer disk 3from S to D
Transfer disk 1from H to S
Transfer disk 2from H to D
Transfer disk 1from S to D
  */