//interface
interface Animal{
    int eyes=2;
    void walk();
}
interface Herbivore{
    
}
class Horse implements Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class Oop11{
    public static void main(String args[]){
        Horse horse =new Horse();
        horse.walk();
    }
}