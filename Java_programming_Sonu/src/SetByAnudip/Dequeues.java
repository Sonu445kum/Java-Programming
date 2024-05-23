package SetByAnudip;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;

public class Dequeues {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        System.out.println("The value Of Dequeue:");
        ad.offer(100);
        ad.offer(80);
        ad.offer(-10);
        ad.offer(20);
        ad.offer(-90);
        ad.offer(-10);
        System.out.println(ad);
        ad.pollFirst();
        System.out.println(ad);
        ad.pollLast();
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        ad.addFirst(33);
        System.out.println(ad);
        ad.addLast(200);
        System.out.println(ad);
        ad.remove();
        System.out.println(ad);
        System.out.println(ad.element());
        Collection<?> object =ad ;
        System.out.println(ad.removeAll(object));
        System.out.println(ad.size());


    }
}
