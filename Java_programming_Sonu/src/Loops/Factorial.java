package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i >= 2; i--) {
            fact = fact * i;
        }
        System.out.println("the factorial of no is :" + fact);
    }
}
