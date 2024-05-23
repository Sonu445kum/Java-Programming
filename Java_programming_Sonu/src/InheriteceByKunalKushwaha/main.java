package InheriteceByKunalKushwaha;

public class main {
    public static void main(String[] args) {
        Box box1=new Box();
        System.out.println(box1.l+" "+ box1.w+" "+ box1.h);// ans-> 1.0,1.0,1.0;
        Box box2=new Box(4);
        System.out.println(box2.l+" "+ box2.w+" "+ box2.h);
        Box box3=new Box(4);
        BoxWeight box4=new BoxWeight(2,4,6,60.0);
        System.out.println(box4.l+" "+ box4.w+" "+ box4.h+" "+box4.weight);
        box1.information();
        BoxWeight box5=new BoxWeight();
        System.out.println(box5.l+" "+ box5.w+" "+box5.h);


    }
}
