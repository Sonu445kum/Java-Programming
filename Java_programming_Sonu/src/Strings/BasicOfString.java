package Strings;
import java.util.*;
public class BasicOfString {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter here value:");
     String str=sc.nextLine();
     String s="Aunshka";
     System.out.println(s);
     char ch=s.charAt(2);// find the  character in string;
        System.out.println(ch);
        String gtr="mango";
        System.out.println(gtr.indexOf('n'));// find index at which character are present;
        String p="hello";
        String q="hello";
        System.out.println(p.compareTo(q));// compare two String ;
        String r="son";
        String ss="Snn";
        System.out.println(r.compareTo(ss));// compare two String ;
        String i="Parishram";
        System.out.println(i.contains("wh"));
        System.out.println(i.startsWith("Pa"));
        System.out.println(i.toLowerCase());;
        System.out.println(i.toUpperCase());;
        // Concatination;
        String s1="abc";
        String s2="def";
        String s3=s1+s2;
        System.out.println(s3);

    }
}
