class Shape{ //Hirarchical inheritance-1 derived class and multiple subclass
    public static void area(){
        System.out.println("Diesplay area");
    }
   
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
 
}
class Circle extends Shape{
    public void area(int l,int h){
        System.out.println((3.14)*r*r);
    }
}
public class Oop8{

    public static void main(String[]args){
        
    }
}

