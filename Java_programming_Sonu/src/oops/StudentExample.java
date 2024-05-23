package oops;
import java.util.*;

public class StudentExample {

        String name;
        int roll;
        double percentage;
        StudentExample(String name1,int roll1,double percentage1){
            this.name=name1;
            this.roll=roll1;
            this.percentage=percentage1;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  sc.roll1=23;
        System.out.println("This is for First Student:");
        StudentExample s=new StudentExample("sonu",23,67.5);
        s.name="Sonu";
        s.roll=23;
        s.percentage=67.5;
        System.out.println("roll no :"+s.roll);
        System.out.println("Name:"+s.name);
        System.out.println("Percentage:"+s.percentage);
        System.out.println("This is for Second Student:");
        StudentExample s1=new StudentExample("Anushka",1,90.5);
        s1.roll=1;
        s1.name="Anushka";
        s1.percentage=90.5;
        System.out.println("roll no :"+s1.roll);
        System.out.println("Name:"+s1.name);
        System.out.println("Percentage:"+s1.percentage);
    }
}
