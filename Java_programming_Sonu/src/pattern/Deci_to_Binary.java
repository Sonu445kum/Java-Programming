package pattern;

import java.util.Scanner;

public class Deci_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        int ans=0;
        int pow=1;
        while(n>0){
            ans+=(n%2)*pow;
            n/=2;
            pow*=10;
        }
        System.out.println(ans);
    }
}
