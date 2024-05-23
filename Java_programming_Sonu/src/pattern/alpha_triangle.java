package pattern;

import java.util.Scanner;

public class alpha_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int a=65;
            for(int j=0; j<=i; j++){
                System.out.print((char)(a+j) +" ");
            }
            System.out.println();
        }
    }
}
