package Anudeep;

import java.util.Scanner;
class Two_largest{

    static int firstMax(int[] arr){
        int n= arr.length;
        int mx= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int secondMax(int[] arr){
        int n=arr.length;
        int mx=firstMax(arr);
        for(int i=0; i<n; i++){
            if(arr[i]==mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax=firstMax(arr);
        return secMax;
    }
    static void Print(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class FindTwoLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array is :");
        int n = sc.nextInt();
        System.out.println(" Enter the element of arrays is");
        int[] arr = new int[n];
        Two_largest tl = new Two_largest();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the original Array:");
        tl.Print(arr);
        System.out.println(" the  First max in an Arrays is " + tl.firstMax(arr));
        System.out.println(" the  Second max in an Arrays is " + tl.secondMax(arr));

    }
}
