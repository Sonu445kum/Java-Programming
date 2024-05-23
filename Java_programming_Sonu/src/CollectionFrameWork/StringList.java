package CollectionFrameWork;

import java.util.ArrayList;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String>str=new ArrayList<>();
        str.add("Hello I m Sonu Kumar");
        System.out.println(str);
        ArrayList<String>str1=new ArrayList<>();
        str1.add("abc");
        str1.add("def");
        str1.add("ghi");
        str1.add("jkl");
        str1.add("mno");
        str1.add("pqr");
        str1.add("stu");
        str1.add("vwx");
        str1.add("yz");
        System.out.println("Before Operation:");
        System.out.println(str1);
        str1.remove(8);
        System.out.println("After operation:");
        System.out.println(str1);
        str1.set(2,"apple");
        System.out.println(str1);
        System.out.println("The Size of ArrayList:"+str1.size());
        System.out.println("The subList of ArrayList:"+str1.subList(2,8));
        System.out.println( "The string are present or not :"+str1.contains("mno"));
    }
}
