package Recursion;

public class KeyPad {
    static void KeyPadProb(String Digit,String[] kp,String Res){
        if(Digit.length()==0){
            System.out.print(Res+" ");
            return;
        }
        int currNum=Digit.charAt(0)-'0';//2
        String currChoice=kp[currNum];//"abc"
        for(int i=0; i<currChoice.length(); i++){//"abc"
            KeyPadProb(Digit.substring(1),kp,Res+currChoice.charAt(i) );
        }
    }
    public static void main(String[] args){
        String Digit="43";
        String[] Kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        KeyPadProb(Digit,Kp, "" );
    }
}
