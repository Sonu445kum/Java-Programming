package Anudeep;
import java.util.*;
class Find{
    static void Odd_even(int[]arr, int size){
    int n=arr.length;
    int even=0,odd=0;
    for(int i=0; i<n; i++){
        if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("The Even Number:"+even);
    System.out.println("The odd Number:"+odd);
    }
    static void Print(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
public class OddEven {
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the size of Arrays:");
      int n=sc.nextInt();
      int[] arr =new int[n];
        Find f=new Find();
        System.out.println("Enter the value of Arrays:");
      for(int i=0; i<arr.length; i++){
          arr[i]=sc.nextInt();
      }
      System.out.println("The original arrays:");
      f.Print(arr);
      f.Odd_even(arr,n);
    }
}
