package CollectionFrameWork;
import java.util.LinkedList;
import java.util.Iterator;
public class Occurrences {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        li.add(4);
        li.add(1);

        Object first_index = li.getFirst();
        System.out.println("the first index:"+first_index);
        Object Second_index = li.getLast();
        System.out.println("the first index:"+Second_index);


    }
}


