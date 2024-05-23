package stringNew;

import java.util.Scanner;

class Palindrome{
    static void isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("Palindrome:");
        }
        else{
            System.out.println(" Not Palindrome:");
        }
    }
}
public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        Palindrome pd=new Palindrome();
        pd.isPalindrome(str);
    }
}
