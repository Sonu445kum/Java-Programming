package Strings;

public class Palindrome {
    public static void main(String[] args){
        String str="abcdcba";
        StringBuilder sb=new StringBuilder(str);
        String s=sb+"";
        if(str.equals(s)){
            System.out.println("Palindrome:");
        }
        else{
            System.out.println("Not Palindrome:");
        }
    }
}
