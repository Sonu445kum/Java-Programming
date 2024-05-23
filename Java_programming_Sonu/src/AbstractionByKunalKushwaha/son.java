package AbstractionByKunalKushwaha;

public class son extends Parent{
    public son(int age){
        super(age);
    }
    @Override
    void normal(){
        super.normal();
    }
    @Override
    void career(){
        System.out.println("I m going to be a teacher:");
    }
    @Override
    void Partner(){
        System.out.println("I love Pepper Potts:");
    }
}
