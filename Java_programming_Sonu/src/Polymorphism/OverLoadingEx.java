package Polymorphism;
class Calculation{
    int Sum(int a, int b){
        return a+b;
    }
    double Sum(double a, double b, double c){
        return a+b+c;
    }
}
    public class OverLoadingEx {
         public static void main(String[] args) {
        Calculation c= new Calculation();
        System.out.println("The Sum of Two Number:"+c.Sum(200,300));
        System.out.println("The Sum of three number:"+c.Sum(20.3,25.5,50.5));

    }
}
