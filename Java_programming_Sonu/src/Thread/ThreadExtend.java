package Thread;
// by using  class -> extends
class Animal extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is under New Process:");
        for(int i=1; i<=5; i++){
            System.out.println("Hello World:"+i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadExtend {
    public static void main(String[] args) {
        Animal a=new Animal();
        System.out.println(a.isAlive());
        a.start();
    }
}
