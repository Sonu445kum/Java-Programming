package pattern;

import java.util.Scanner;

public class timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            int space=n-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            int space=n-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
