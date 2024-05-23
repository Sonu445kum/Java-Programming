package Strings;
import java.util.*;
public class Equals {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String:");
//        String str=sc.nextLine();
        String s1="hello";
        String s2="hello";
        String s3= new String("hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
