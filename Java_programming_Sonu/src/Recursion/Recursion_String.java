package Recursion;
import java.util.Scanner;
import java.util.ArrayList;
class SubSequence{
    static ArrayList<String>PrintSubSequence(String s){
        ArrayList<String> ans=new ArrayList<>();
        // Base Case;
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        //Recursive Call;
        char Curr=s.charAt(0);//["a"]
        ArrayList<String>SmallAns=PrintSubSequence(s.substring(1));
        for(String ss:SmallAns){
            ans.add(ss);//["bc","b","c",""]
            ans.add(Curr+ss);//["abc","ac","a","ab","bc","b","c"," "]
        }
        return ans;
    }
}
class Palindrome{
    static boolean checkPalindrome(String s,int l,int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && checkPalindrome(s,l+1,r-1));
    }
    static String isPalindrome(String s,int idx){
        // Base Case;
        if(idx==s.length()){
            return "";
        }
        // Recursive Call;
        String SmallAns=isPalindrome(s,idx+1);
        return SmallAns+ s.charAt(idx);
    }
}
class Reverse{
    static String ReverseString(String s,int idx){
        // Base Case;
        if(idx==s.length()){
            return " ";
        }
        // Recursive Call;
        String SmallAns=ReverseString(s,idx+1);
        return SmallAns+ s.charAt(idx);
    }
}
class RemoveOccurrence{
    static String RemoveA(String s,int idx){
        // Base Case;
        if(idx==s.length()){
            return " ";
        }
        // Recursive Relation;
        String  small=RemoveA(s,idx+1);
        char ch=s.charAt(idx);
        if(ch!='a'){
            return ch+small;
        }
        else{
            return small;
        }
    }
}
public class Recursion_String {
    public static void main(String[]args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter your value:");
      String s=sc.nextLine();
      RemoveOccurrence ro=new RemoveOccurrence();
 Reverse rs=new Reverse();
  Palindrome pd=new Palindrome();
       SubSequence sq=new SubSequence();
     System.out.println("The Remove occurrence of A is:"+ro.RemoveA(s,0));
        System.out.println("The Reverse String is:"+rs.ReverseString(s,0));
        String rev=pd.isPalindrome(s,0);
      if(rev.equals(s)){
          System.out.println("Palindrome");
      }
      else {
          System.out.println(" Not  Palindrome:");
    }
          System.out.println(pd.checkPalindrome(s,0,s.length()-1));
           System.out.println("The SubSequence Of String:");
           ArrayList<String> ans=sq.PrintSubSequence(s);
        for(String ss:ans){
            System.out.println(ans);
        }
            System.out.println(ans);
       }
}

