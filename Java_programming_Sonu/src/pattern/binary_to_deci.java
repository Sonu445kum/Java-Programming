package pattern;

import java.util.Scanner;

public class binary_to_deci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        int ans=0;
        int pow=1;
        while(n>0){
            ans+=(n%10)*pow;
            n/=10;
            pow*=2;
        }
        System.out.println(ans);
    }
}