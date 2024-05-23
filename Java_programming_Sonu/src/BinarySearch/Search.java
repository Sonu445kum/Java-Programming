package BinarySearch;
import java.util.Scanner;
class Check{
    public  static int    Find(int[] arr, int x){
        int n=arr.length;
        int st=0;
        int end=n-1;
        int mid=(st+end)/2;
        while(st<=end){
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }

        return -1;
    }
    void Display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
public class Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        Check ch= new Check();
        System.out.println("Enter The value of An Array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Value Of An Array:");
        ch.Display(arr);
        System.out.println("Enter the Target Value:");
        int x= sc.nextInt();
       int ans=ch.Find(arr,x);
       if(ans==-1){
           System.out.println("The Element Are Not found:");
       }
       else{
           System.out.println("The Element found At Index:"+ans);
       }

    }
}
