package Recursion;

import java.util.Scanner;
class GCD{
    static int newGcd(int x,int y){
        if(y==0) {
            return x;
        }
        return newGcd(y,x%y);
    }
    static int gcd(int x,int y){
        while(x%y!=0){
            int rem= x%y;
            x=y;
            y=rem;
        }
        return y;
    }
}
class Series{
    static int SumOddEven(int n){
        if(n==0)return 0;
        if(n%2==0) {
            return SumOddEven(n-1)-n;
        }
        else{
            return SumOddEven(n-1)+n;
        }
    }
    static int  SumOfSeries(int n){
        if(n==0){
            return 0;
        }
        return n+SumOfSeries(n-1);
    }
}
class MUl{
    static void PrintTable(int n, int k){
        // base Case;
        if(k==1){
            System.out.println(n);
            return ;
        }
        // Recursive Call;
        PrintTable(n,k-1);
        // Self Work;
        System.out.print(n*k+ " ");
    }
}
class Power{
    static int PowOfTwo(int a,int b){
        if(b==0){
            return 1;
        }
        return a*PowOfTwo(a,b-1);
    }
}
class POW{
    static int PowOfNum(int n){
        if(n==0){
            return 1;
        }
        return 2* PowOfNum(n-1);
    }
}
class SoD{
    static int SumOfDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return SumOfDigits(n/10)+ n%10;
    }
}
class Find {
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    static int Fibonacci(int n){

            if(n==0 ){
                return 0;
            }
             if(n==1 ){
                return 1;
        }
             int ans=Fibonacci(n-1)+ Fibonacci(n-2);
            return  ans;
        }


}
class Print{
    static void PrintNumDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n);
        PrintNum(n-1);

     }
    static void PrintNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintNum(n-1);
        System.out.println(n);
    }
}
public class Solved {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
     //  System.out.println("Enter the Number:");
        Print pn=new Print();
        Find Fn=new Find();
        SoD sd=new SoD();
        POW pow=new POW();
        Power pw=new Power();
        MUl mul=new MUl();
        Series ss=new Series();
        GCD gd=new GCD();
      //  int n=sc.nextInt();
//        System.out.println("Enter the value of a:");
//        int a=sc.nextInt();
//        System.out.println("Enter the value of b:");
//        int b=sc.nextInt();
//        System.out.println("Enter the value of n:");
//        int n=sc.nextInt();
//        System.out.println("Enter the value of k:");
//        int k=sc.nextInt();

       // System.out.println("The Number is:");
       // pn.PrintNum(n);
        //pn.PrintNumDec(n);
//        System.out.println("The Fibonacci  Number is:");
//        System.out.println(Fn. Fibonacci(n));
//        System.out.println("The Factorial  of  Number is:");
//        System.out.println(Fn. Factorial(n));
//        System.out.println("The Sum of Digits  of a Number is:");
//        System.out.println(sd.SumOfDigits(n));
//        System.out.println("The Power  of a Number is:");
//        System.out.println(pow.PowOfNum(n));
//        System.out.println("The Power  of a :b is:");
//        System.out.println(pw.PowOfTwo(a,b));
//        System.out.println(" the table of n and k:");
//        mul.PrintTable(n,k);
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        System.out.println("Enter the value of y:");
        int y=sc.nextInt();
        System.out.println("The Gcd of X and Y Num:"+gd.gcd(x,y));
        System.out.println("The newGcd of X and Y Num:"+gd.newGcd(x,y));

    }
}
