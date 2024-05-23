package BinarySearch;

import java.util.Scanner;
class Bs{
    public boolean Search(int[] arr,int st,int end,int x){
        if(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==x){
                return true;
            }
            else if(arr[mid]>x){
                return Search(arr,st,end-1,x);
            }
            else{
                return Search(arr,st+1,end,x);
            }
        }
        return false;

    }

}

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
       Bs b=new Bs();
        System.out.println("Enter The value of An Array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Target Value:");
        int x= sc.nextInt();
        System.out.println("the element at found:"+b.Search(arr,0,n-1,x));
    }
}
