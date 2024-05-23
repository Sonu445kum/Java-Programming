package Constructor;
import java.util.Scanner;
class FindArea{
    // Instance Variable
    int length;
    int Breadth;
    // parameter Constructor;
    public FindArea(int length1,int Breadth1){
        this.length=length1;
        this.Breadth=Breadth1;
    }
    // Method;
        int Find(){
        int Area=length*Breadth;
        return Area;
        }
    }
// Main Class;
    public class Area {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Value:");
        int length1=sc.nextInt();
        System.out.println("Enter Second Value:");
        int Breadth1=sc.nextInt();
        FindArea fa=new FindArea(length1,Breadth1);
        fa.Find();
        System.out.println("Area Of Rectangle:"+fa.Find());
        }
    }
