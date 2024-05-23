package SetByAnudip;
import java.util.Collection;
import java.util.PriorityQueue;
public class Example {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        System.out.println("The value of pq:");
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        System.out.println(pq);
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        System.out.println("The value of pq1:");
        pq1.add(50);
        pq1.add(20);
        pq1.add(60);
        pq1.add(40);
        pq1.add(80);
        pq1.add(10);
        System.out.println(pq1);

        System.out.println(pq1.element());
        pq1.poll();
        System.out.println(pq1);
        System.out.println( pq1.peek());
        System.out.println(pq1);
        pq1.poll();
        System.out.println(pq1);

        System.out.println( pq1.remove());
        System.out.println(pq1);
        Collection<?> objects = pq1;
        System.out.println(pq1.removeAll(objects));
        System.out.println(pq1.size());
        PriorityQueue<Integer>pq2=new PriorityQueue<>();
        System.out.println("The value of pq2:");
        pq2.offer(20);
        pq2.offer(10);
        pq2.offer(200);
        pq2.offer(-20);
        pq2.offer(-2);
        System.out.println(pq2);
        pq2.poll();
        System.out.println(pq2);
        pq2.peek();
        System.out.println();
        pq2.poll();
        System.out.println(pq2);

    }
}
