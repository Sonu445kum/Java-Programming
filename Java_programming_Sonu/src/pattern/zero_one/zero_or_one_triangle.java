package pattern.zero_one;

import java.util.Scanner;

public class zero_or_one_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
               if(j%2==0){
                   System.out.print("0");
               }
               else{
                   System.out.print("1");
               }
            }
            System.out.println();
        }
    }
}
