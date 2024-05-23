package Anudeep;
import java.util.Scanner;
class Search{
   static void SearchEle(int[] arr,int x){
     boolean test=false;
     for(int element:arr){
         if(element==x){
             test=true;
             break;
         }
     }
     System.out.println("is"+" "+x+" "+"present in the Array:"+test);

   }
}
class Reverse{
    static void RevArrays(int[] arr){
        int n=arr.length;
        for(int i=arr.length-1; i>=0; i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
class Displays{
    static void PrintArrays(int [] arr){
        int n=arr.length;
       for(int i=0; i<n; i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}
public class Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Arrays:");
        int n=sc.nextInt();


        Displays dp=new Displays();
        Reverse rv=new Reverse();
        Search sr=new Search();
        int[] arr=new int[n];
        System.out.println("Enter the element of Arrays:");
        for(int i=0; i<n; i++){

            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element for Search:");
        int x=sc.nextInt();
        System.out.println(" The original Arrays is:");
        dp.PrintArrays(arr);
//        System.out.println(" The Reverse Arrays is:");
//       rv.RevArrays(arr);
        sr.SearchEle(arr,x);


    }
}
