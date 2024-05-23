package AnudipAssignment;

import java.util.Scanner;
class Check{
    static int  RevDigits(int n){
        int res=0;
        while(n!=0){
            int rem=n%10;
            res=(res*10)+rem;
            n=n/10;
        }
        return res;
    }
    static int isPalindrome (int n){
        int rev_n=RevDigits(n);
        if(rev_n==n){
            return 1;
        }
        else{
            return 0;
        }

    }
}

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Check ch=new Check();
        System.out.println("Enter your Number:");
        int n=sc.nextInt();
        System.out.println("The Reverse Digits is:"+ch.RevDigits(n));
        int ans=ch.isPalindrome(n);
        System.out.println(" isPalindrome:"+ans);

    }
}
