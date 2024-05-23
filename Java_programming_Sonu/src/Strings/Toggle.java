package Strings;
import java.util.*;
public class Toggle {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
        // PHysiCs->phYSIcS;
        for(int i=0; i<sb.length(); i++){
            // P->p;
            // check-> Alphabet-> Small,Capital;
            boolean flag=true;// ture->capital;
            char ch=sb.charAt(i);
            int Asci=(int)ch;
            if(ch==' ') continue;
            if(Asci>=97) flag=false;// letters Small;
            if(flag==true){
                Asci+=32;
                char dh=(char)Asci;// a
                sb.setCharAt(i,dh);
            }
            else{
                Asci-=32;
                char dh=(char)Asci;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);
    }
}
