class Shape{ //multi level inheritance
    public static void area(){
        System.out.println("Diesplay area");
    }
   
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
 
}
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
public class Oop7{

    public static void main(String[]args){
        
    }
}

