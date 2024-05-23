package SetByAnudip;
import java.util.PriorityQueue;
import java.util.Scanner;
class find{
    int add(PriorityQueue<Integer>ad){
        int sum=0;
        while(!ad.isEmpty()){
            sum+=ad.poll();
        }
        return sum;
    }
}
public class Sum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of PriorityQueue:");
        int n=sc.nextInt();
        PriorityQueue<Integer> ad=new PriorityQueue<>();
        System.out.println("the value of PriorityQueue:");
        for(int i=0; i< n; i++){
            ad.add(sc.nextInt());
        }
        System.out.println(ad);
       find f= new find();
       int ans=f.add(ad);
        System.out.println("The sum of PriorityQueue:"+ans);


    }
}
