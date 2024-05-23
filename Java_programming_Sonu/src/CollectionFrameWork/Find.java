package CollectionFrameWork;
import java.util.LinkedList;
import java.util.Scanner;
class Occurrence {
    public int First_Occ(LinkedList<Integer> li, int x,int n) {
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (li.get(i) == x)
                ans = i;
        }
        return ans;
    }
    public int Last_Occ(LinkedList<Integer> li, int x,int n) {
        int res = -1;
        for (int i = n-1; i >=0; i--) {
            if (li.get(i) == x)
                res = i;
        }
        return res;
    }
    public void Display(LinkedList<Integer> li) {
        for (int v : li) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
        class Find {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Size of LinkedList:");
                int n = sc.nextInt();
                LinkedList<Integer> li = new LinkedList<>();
                System.out.println("Enter the Elements of LinkedList:");
                for (int i = 0; i < n; i++) {
                    li.add(sc.nextInt());
                }
                Occurrence oc = new Occurrence();
                System.out.println("The elements of LinkedList:");
                oc.Display(li);
                System.out.println("Enter the Target:");
                int x = sc.nextInt();
                int val2=oc.Last_Occ(li,x,n);
                System.out.println("The  First Occurrence of Lined List " + x + " :" +val2);
                int val1=oc.First_Occ(li,x,n);
                System.out.println("The last occurrence of Linked List " + x + " :"+ val1);
            }
        }


