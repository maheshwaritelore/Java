class Pen{
    String color;
    String type;//ballpoint pen;get

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

public class Oop1{
    
    public static void main(String[]args){
        Pen pen1=new Pen();
        pen1.color="Red";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.color="Blue";
        pen1.type="Ballpoint";

        pen1.printColor();
        pen2.printColor();
    }

   
}