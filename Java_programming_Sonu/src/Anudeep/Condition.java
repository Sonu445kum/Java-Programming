package Anudeep;
import java.util.Scanner;
class Test{
    void Divisible(int a){
        if(a/11==0){
            System.out.println("A is divisible by 11");
        }
        else{
            System.out.println("A is not divisible by 11");
        }
    }
}
class Check{

    void Greater_Smaller(int ram,int Sonu){
        if(ram>Sonu){
            System.out.println("ram is Greater than sonu");
        }
        else{
            System.out.println("Sonu is Greater than ram");
        }
    }

}
public class Condition {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Check obj=new Check();
        Test obj1=new Test();
        System.out.println("Enter the first Number is:");
        int a=sc.nextInt();
//        System.out.println("Enter the Second Number is:");
//        int b=sc.nextInt();
       // obj.Greater_Smaller(1,2);
        obj1.Divisible(22);
    }
}
