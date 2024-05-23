package Abstracts;
//Example of an abstract class that has abstract and non-abstract methods
abstract class Bikes{
    Bikes(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bikes{
    void run(){System.out.println("running safely..");}
}
public class Test_Abstraction2 {
    public static void main(String args[]){
        Bikes obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
