package Array;
import java.util.Scanner;
public class miscProblem{
    static void  reverseArrays(int[] arr){
        for(int i=arr.length-1; i>=0; i--){

            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
    static void Swap_Maths(int a,int b){
        System.out.println("the original value of a and b is :");
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
        // a=9,b=3;
       a=a+b;
       b=a-b;
       a=a-b;

        System.out.println("value after swapping of  a and b is :");
        // a=3; b=9;
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
    }
    static void Swap(int a,int b){
        System.out.println("the original value of a and b is :");
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
        // a=9,b=3;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value after swapping of  a and b is :");
        // a=3; b=9;
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
    }
    public static void main(String[] args){
//        int a=9;
//        int b=3;
//        Swap(a,b);
//        Swap_Maths(a,b);
        // Arrays Declaration here;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Size of Arrays is :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+ n +" " +"element");
        System.out.println(" the reverse Arrays is:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        reverseArrays(arr);


    }
}
