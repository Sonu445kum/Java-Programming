package BinarySearch;
import java.util.Scanner;

class Occurrence{
    static int Find(int[] arr,int x){
        int n=arr.length;
        int st=0; int end=n-1;
        int Found=-1;
        while(st<=end){
            int mid= st+ (end-st)/2;
           if(arr[mid]==x){
               Found=mid;
               end=mid-1;
           } else if (x<arr[mid]){
               end=mid-1;
           }
           else {
               st=mid+1;
           }
        }
        return Found;
    }
    static void Display(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the Value Of An Array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Occurrence oc= new Occurrence();
        System.out.println("The Value Of An Array:");
        oc.Display(arr);
        System.out.println("Enter the Target:");
        int x=sc.nextInt();
        System.out.println("The First Occurrence Of X:"+oc.Find(arr,x));
        }

    }

