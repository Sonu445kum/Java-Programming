package Anudeep;

import java.util.Scanner;
class Minimum_Maximum{
    static void  MaxAndMin(int[] arr, int size){
        int max_element = arr[0], min_element = arr[0]; //Initializing with first element.
        int n=arr.length;
        for(int i =0;i<n;i++)

        {
            if (arr[i] > max_element) { //Checking Maximum element
                max_element = arr[i];
            }

            if (arr[i] < min_element) { //Checking Minimum element
                min_element = arr[i];
            }
        }
        System.out.println("\n Maximum Number: " + max_element);
        System.out.println("\n Minimum Number: " + min_element);
    }

    static void Print(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class MinorMax {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Arrays:");
        int n=sc.nextInt();
       // int sum=0;
        int[] arr =new int[n];
        Minimum_Maximum Mm=new Minimum_Maximum();
        System.out.println("Enter the value of arrays:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original Arrays :");
        Mm.Print(arr);
        Mm.MaxAndMin(arr,n);
    }
}
