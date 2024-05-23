package AbstractionByKunalKushwaha;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age=age;

    }
    static void hello(){
        System.out.println("hello my fd:");
    }
    void normal(){
        System.out.println("This is a normal:");
    }
    abstract void career();
    abstract void Partner();
}
