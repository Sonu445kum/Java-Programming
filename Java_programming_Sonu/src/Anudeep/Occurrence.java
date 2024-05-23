package Anudeep;
import BasicofJava1.Printing_no;

import java.util.Scanner;
class Frequency{
    static int  Find(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    static void Print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Occurrence {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      System.out.println("Enter the value of array:");
        int[] arr=new int[n];
      Frequency fb= new Frequency();
      for(int i=0; i< arr.length; i++){
          arr[i]=sc.nextInt();
      }
      System.out.println("The initial value of Array:");
      fb.Print(arr);
      System.out.println("Enter the target value:");
      int x=sc.nextInt();
      System.out.println();
      System.out.println( "The Frequency of"+" "+x+": "+fb.Find(arr,x));
    }
}
