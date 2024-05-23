package stringNew;
import java.util.Scanner;
class Solved{
    static void index(String str){
        int n=str.length()-1;
       String gtr="Physics";
        System.out.println(gtr.indexOf('y'));
    }
}
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        Solved s=new Solved();
        s.index(str);
        String gtr="mango";
        System.out.println(gtr.indexOf('n'));// find index at which character are present;
        String p="hello";
        String q="hello";
        System.out.println(p.compareTo(q));// compare two String ;
        String r="son";
        String i="Parishram";
        System.out.println(i.contains("wh"));
        System.out.println(i.startsWith("Pa"));
        System.out.println(i.toLowerCase());
        System.out.println(i.toUpperCase());
        System.out.println(i.substring(1));
        System.out.println(i.substring(1,4));
    }
}
