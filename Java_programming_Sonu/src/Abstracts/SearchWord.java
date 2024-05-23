package Abstracts;
import java.util.Scanner;
class  Search{
    String name;
    char c;
    Search(){
    }
    public static int count(String str, char c)
    {
        int res = 0;

        for (int i=0; i<str.length(); i++)
        {
            // checking character in string
            if (str.charAt(i) == c)
                res++;
        }
        return res;
    }
}



public class SearchWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String str=sc.nextLine();
        System.out.println("Enter the target:");
        char c = sc.nextLine().charAt(0);
        Search se=new Search();
       int ans= se.count(str,c);
        System.out.println("the no counts is:"+ans);




    }
}
