class Shape{ //single level inheritance
    public static void area(){
        System.out.println("Diesplay area");
    }
   
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
 
}

public class Oop6{

    public static void main(String[]args){
        Triangle t1=new Triangle();

        t1.color="red";
        System.out.println();
    }
}

