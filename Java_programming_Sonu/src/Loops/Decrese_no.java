package Loops;

import java.util.Scanner;

public class Decrese_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
      for(int num=n; num>=1; num--){
          System.out.println(num);
      }

    }
}
