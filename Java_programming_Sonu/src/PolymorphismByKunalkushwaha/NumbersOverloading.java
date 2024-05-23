package PolymorphismByKunalkushwaha;

public class NumbersOverloading {
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(double a,double b){
        return a+b;
    }
    double sum(double a,int b){
        return a+b;
    }
    double sum(double a,double b,double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        NumbersOverloading ns= new NumbersOverloading();
        System.out.println(ns.sum(2,3,4));
        System.out.println( ns.sum(20.0,30.0));
        System.out.println(ns.sum(25.0,25.0));
        System.out.println(ns.sum(12.0,24.0,36.0));
    }

}
