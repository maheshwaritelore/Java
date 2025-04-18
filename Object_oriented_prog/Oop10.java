//abstraction
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class humen extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class Oop10{
    public static void main(String args[]){
        Horse horse =new Horse();
        // horse.walk();
        // horse.eat();

        
    }
}