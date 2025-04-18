class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Oop2{

    public static void main(String[]args){
        Student student1=new Student("Mahi",20);
        
        student1.printInfo();
    }
}