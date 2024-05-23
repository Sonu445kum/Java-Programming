package oops;
class student{
    int roll_no;
    String name;
}

public class main {
    public static void main(String[] args){
        student obj1=new student();
        obj1.roll_no=20;
        obj1.name="Sonu kumar";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.name);
        student obj2=new student();
        obj2.roll_no=30;
        obj2.name="Anushka";
        System.out.println(obj2.roll_no);
        System.out.println(obj2.name);

    }
}
