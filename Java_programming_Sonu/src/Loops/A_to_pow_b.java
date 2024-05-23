package Loops;

import java.util.Scanner;

public class A_to_pow_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        int ans=1;
        for(int i=1; i<=b; i++){
            ans*=a;
        }
        System.out.println(" A is to power b is :"+ ans);
    }
}
