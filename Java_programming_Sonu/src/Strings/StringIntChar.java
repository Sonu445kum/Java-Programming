package Strings;
import java.util.*;
public class StringIntChar {
    public static  void main(String[]args){
      Scanner sc= new Scanner(System.in);
      String str="abc";
      str+="xyz";
      str+='r';
      str+=10;
      System.out.println(str);
      String gtr="abc";
        System.out.println("abc"+"xyz"+'r'+10);
        System.out.println("abc"+"xyz"+'r'+10+20+30);
        System.out.println(10+20+30+"abc"+"xyz"+'r');

    }
}
