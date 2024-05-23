package Strings;
import java.util.*;
public class PrintsAllSubStr {
    static void SubString(String s){
        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("SubString are:");
        SubString(str);
    }

}
