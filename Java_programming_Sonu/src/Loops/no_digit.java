package Loops;

import java.util.Scanner;

public class no_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        int count=0;
        int original_n=n;
        while(n>0){
           n=n/10;
           count++;
        }
        System.out.println("the no of digit is :"+ count);
    }
}
