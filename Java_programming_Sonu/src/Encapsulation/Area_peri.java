package Encapsulation;
import java.util.Scanner;
// Sub Class;
class Solved{
    private int length;
    private int Breadth;
    // Setter;
    void setLength(int len){
        this.length=len;
    }
    void setBreadth(int Bd){
        this.Breadth=Bd;
    }
    // Getter-> Get the value;
    int getLength(){
        return this.length;
    }
    int getBreadth(){
        return this.Breadth;
    }
    int AreaRect(){
        int res=this.getLength()*this.getBreadth();
        return res;
    }
    int PerimeterRect(){
        int ans=2*(this.getLength()+ this.getBreadth());
        return ans;
    }
}
// Main Class;
public class Area_peri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int len=sc.nextInt();
        System.out.println("Enter Breadth:");
        int Bd=sc.nextInt();
        Solved s=new Solved();
        s.setBreadth(len);
        s.setLength(Bd);
        System.out.println("Area of Rectangle:"+s.AreaRect());
        System.out.println("Perimeter of Rectangle:"+s.PerimeterRect());
    }
}
