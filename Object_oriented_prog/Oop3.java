class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    
    Student(Student s2){//copy constructor
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }
}
public class Oop3{

    public static void main(String[]args){
        Student s1=new Student();

        s1.name="mahi";
        s1.age=21;

        Student s2=new Student(s1);
        
        s2.printInfo();
    }
}

/*
mahi
21
*/
