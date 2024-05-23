package InheriteceByKunalKushwaha;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight=40;
    }
    public BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);// this is call to parent class constructor;
        this.weight=weight;
    }
}
