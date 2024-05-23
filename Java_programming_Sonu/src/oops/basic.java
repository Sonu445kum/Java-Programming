package oops;
import java.util.Scanner;
class solve{
    int a,b;
    solve(int x,int y){
        a=x;
        b=y;
        System.out.println("constructor are called ");
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class basic {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the  num");
        solve obj1=new solve(10,5);
        System.out.println(obj1.add());
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());
    }
}
