class Student{
    String name;
    int age;
    //function overloading ->polimorphism
    public void printInfo(String name){
        System.out.println(name);
        
    }
    public void printInfo(int age){
        System.out.println(age);
        
    }
    public void printInfo(String name , int age){
        System.out.println(name+" "+age);
        
    }
   
}
public class Oop4{

    public static void main(String[]args){
        Student s1=new Student();

        s1.name="mahi";
        s1.age=21;
        
        s1.printInfo(s1.age);
    }
}

/*
21
*/
