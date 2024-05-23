package Thread;
// By using interface -> implements;
class Sonu implements Runnable{
    public boolean isAlive;

    @Override
    public void run() {
        System.out.println("Thread is Under  Running Process:");
        for(int i=1; i<=5; i++){
            System.out.println("Bharat:"+i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadRun {
    public static void main(String[] args) {
        Sonu s= new Sonu();
        Thread t=new Thread(s);
        System.out.println(s.isAlive);
        t.start();
    }
}
