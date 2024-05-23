package InterfaceByKunalKushwaha;

public class car implements Engine,Break{
    @Override
    public void Breaks(){
        System.out.println("I break like normal car:");
    }
    @Override
    public void start(){
        System.out.println("I start like to normal car:");
    }
    @Override
    public void acc(){
        System.out.println("I Acc like normal car:");
    }
    @Override
    public void stop(){
        System.out.println("I stop like normal car:");
    }
}
