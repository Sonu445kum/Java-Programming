package Inheritence;
import java.util.Scanner;
  class shape{
     double getPerimeter(){
         return 0.0;
     }
    double getArea(){
         return 0.0;
    }
}
  class circle extends  shape{
   private double radius;
    circle(double radius){
        this.radius=radius;
    }
    @Override double  getPerimeter(){
        double ans=2*Math.PI*radius;
        return ans;
    }
    @Override double  getArea(){
        double res=Math.PI*radius*radius;
       return res;
    }

}
public class SingleInheritence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  First Radius :");
        double r1=sc.nextInt();
        circle c1=new circle(r1);
        System.out.println("Radius of the circle="+r1);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Enter the  Second Radius :");
        double r2=sc.nextInt();
        circle c2=new circle(r2);
        System.out.println("Radius of the circle="+r2);
        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println("Area: " + c2.getArea());



    }
}
