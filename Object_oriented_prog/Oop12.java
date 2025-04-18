class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school="newschool";
    }
}
public class Oop12{
    public static void main(String []args){
        Student.school="AVCOE";
        Student s1=new Student();
        s1.name="Mahi";
        System.out.println(s1.school);
    }
}