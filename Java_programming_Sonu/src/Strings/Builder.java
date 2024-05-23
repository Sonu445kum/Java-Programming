package Strings;
import java.util.*;
public class Builder {
    public static void main(String[] args){
        StringBuilder str= new StringBuilder("hello");
        System.out.println(str);// hello;
        str.setCharAt(0,'p');
        System.out.println(str);//pello;setChar use;
        // Append;
        str.append("give");
        System.out.println(str);// Pellogive;
        // insert;
        str.insert(1,'y');
        System.out.println(str);// pyellogive;
        // Delete;
        str.deleteCharAt(0);
        System.out.println(str);// yellogive;
        // Reverse String;
        StringBuilder sb= new StringBuilder("hello");
        sb.reverse();
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);


    }
}
