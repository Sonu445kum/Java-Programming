package SetByAnudip;

import java.util.ArrayDeque;
import java.util.Scanner;
class finds{
    int Product(ArrayDeque<Integer>ad){
        int prod=1;
        while(!ad.isEmpty()){
            prod*=ad.poll();
        }
        return prod;
    }
}
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of ArrayDequeue:");
        int n = sc.nextInt();
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        System.out.println("the value of ArrayDeque:");
        for (int i = 0; i < n; i++) {
            ad.add(sc.nextInt());
        }
        System.out.println(ad);
        finds f = new finds();
        int ans = f.Product(ad);
        System.out.println("The Product of ArrayDeque Elements:"+ans);
    }
}
