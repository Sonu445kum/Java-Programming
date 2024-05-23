package Thread;
class Dog extends Thread{
    @Override
    public  void run(){
        System.out.println("Thread is Under Process:");
        for(int i=0; i<5; i++){
            System.out.println("Thread is :"+i);
        }
        try{
            Thread.sleep(4000);
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}
public class ThreadsEx {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.run();
        System.out.println(d.isAlive());
        d.start();
    }
}
