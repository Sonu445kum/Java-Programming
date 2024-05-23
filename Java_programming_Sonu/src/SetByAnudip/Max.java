package SetByAnudip;
import java.util.ArrayDeque;
import java.util.Scanner;
class solved {
    int Maximum(ArrayDeque<Integer> ad) {
        int max = Integer.MIN_VALUE;
        for (int v : ad) {
            if (v > max) max=v;

        }
        return max;
    }
}
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of ArrayDequeue:");
        int n = sc.nextInt();
        System.out.println("the value of ArrayDeque:");
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            ad.add(sc.nextInt());
        }
        System.out.println(ad);
        solved s = new solved();
        int ans = s.Maximum(ad);
        System.out.println("Maximum value of ArrayDeque:"+ans);
    }
}
