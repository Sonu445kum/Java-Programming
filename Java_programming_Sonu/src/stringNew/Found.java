package stringNew;
import java_Input2.Find_Rem;

import java.util.Scanner;
class Search{
    static boolean  Find(String str,String x){
        int  s=str.length();
        for(int i=0; i<s; i++){
            if(str.contains(x)){
                return true;
            }

        }
        return false;
    }
}
public class Found {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Search String:");
        String x=sc.nextLine();
        Search ss=new Search();
        ss.Find(str,x);
       if( ss.Find(str,x)==true){
           System.out.println("Present:");
       }
        else{
           System.out.println("Not Present:");
       }

    }
}
