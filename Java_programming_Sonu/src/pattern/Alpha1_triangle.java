package pattern;

import java.util.Scanner;

public class Alpha1_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        int a=65;
        for(int i=0; i<=n; i++){

            for(int j=0; j<=i; j++){
                System.out.print((char)a+" ");
            }
            a++;
            System.out.println();
        }
    }
}
