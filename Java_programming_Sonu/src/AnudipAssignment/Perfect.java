package AnudipAssignment;

import java.util.Scanner;

public class Perfect {
    static void CheckPerfectRange(int n) {
        int original = n;
        int sum = 0;
        for (int i = 1; i < original; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (original == sum) {
            System.out.println("This is Perfect Number:");
        } else {
            System.out.println("This is Not Perfect Number:");
        }
    }
    static void CheckPerfect(int n) {
        int original = n;
        int sum = 0;
        for (int i = 1; i < original; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (original == sum) {
            System.out.println("This is Perfect Number:");
        } else {
            System.out.println("This is Not Perfect Number:");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        CheckPerfect(n);
    }
}
