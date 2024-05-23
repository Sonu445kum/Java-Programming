package Array;
import java.util.Scanner;
public class inputArray {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Number:");
//        int n=sc.nextInt();
        int [] arr=new int[5];
        arr[0]=12;
        arr[1]=14;
        arr[2]=15;
        arr[3]=16;
        arr[4]=20;
//        for(int i=0; i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        System.out.println(" original array is :");
        printArray(arr);
        int [] arr2=arr.clone();
        System.out.println(" copied arrays is : ");
        printArray(arr2);
        // changing the  some value of array 2 is
        arr2[0]=1;
        arr2[1]=20;
        arr2[2]=100;
        System.out.println(" original  value of arr is");
        printArray(arr);
        System.out.println(" copied value of arr2 is ");
        printArray(arr2);
    }

}
