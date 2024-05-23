package Anudeep;
import java.util.Scanner;
class Display{
    void Division(int a,int b){
        int res=a/b;
        System.out.println(" the Division of two no is:"+res);
    }
    void multiply(int a,int b){
        int res=a*b;
        System.out.println(" the product of two no is:"+res);
    }
    void sub(int a, int b){
        int res=a-b;
        System.out.println(" the diff of two no is:"+res);
    }
    void add(int a,int b){

        int c=a+b;
        System.out.println("sum of two no is:"+c);
    }
    void Print(){
       System.out.println(" I am Learning jav:");
    }
}
public class print {
    public static  void main(String[] args){
      //  Scanner scc= new Scanner(System.in);
     //   int a= sc.nextInt();
     //   int b=
       System.out.println(" hello india ");
       Display  obj= new Display();
       obj.Print();
//       obj.add(200,300);
       // obj.sub(500,200);
        obj.multiply(10,20);
        obj.Division(100,30);
    }
}
