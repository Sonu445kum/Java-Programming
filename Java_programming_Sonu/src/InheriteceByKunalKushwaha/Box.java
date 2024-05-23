package InheriteceByKunalKushwaha;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.l=1;
        this.w=1;
        this.h=1;
    }
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    Box(double l1,double w1,double h1){
        this.l=l1;
        this.w=w1;
        this.h=h1;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
