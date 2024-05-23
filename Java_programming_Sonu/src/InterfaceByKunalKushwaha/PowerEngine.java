package InterfaceByKunalKushwaha;

public class PowerEngine implements Engine ,Break{
    @Override
    public void Breaks(){
        System.out.println("I break like PowerEngine car:");
    }
    @Override
    public void start(){
        System.out.println("I start like to PowerEngine car:");
    }
    @Override
    public void acc(){
        System.out.println("I Acc like PowerEngine car:");
    }
    @Override
    public void stop(){
        System.out.println("I stop like PowerEngine car:");
    }
}
