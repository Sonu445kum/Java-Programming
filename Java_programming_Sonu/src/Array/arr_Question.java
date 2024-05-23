package Array;

import java.util.Scanner;

public class arr_Question {
    static int findRepeatNo(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int findMax(int[] arr){
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
        int mx=findMax(arr);
        for(int i=0; i<n; i++){
            if(arr[i]==mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax=findMax(arr);
        return secMax;
    }
    static int findUnique(int [] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    static int tripletSum(int[] arr,int target){
        int n= arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
   static int pairSum(int[] arr,int target){
       int n=arr.length;
       int ans=0;
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               if(arr[i]+arr[j]==target){
                 ans++;
               }
           }
       }
       return ans;

   }
    static boolean isSorted(int[] arr){
        boolean check= true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
    static int strictly_Greater(int[] arr,int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    static int last_index(int[] arr,int x){
        int lastOccurrence=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastOccurrence=i;
            }
        }
        return lastOccurrence;
    }
    static int countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array is :");
        int n = sc.nextInt();
        System.out.println(" Enter the element of arrays is");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(" Enter the x;");
//        int x = sc.nextInt();
      //  System.out.println("the no of Occurrence is: " + countOccurrence(arr, x));
      //  System.out.println(" the lastOccurrence of array is :"+ last_index(arr,x));
      //  System.out.println(" the no of element is greater than x is :"+ strictly_Greater(arr,x));
       // System.out.println(" Arrays are Sorted:"+ isSorted(arr));
       // System.out.println(" Enter the target;");
      //  int target = sc.nextInt();
       // System.out.println("the no of pairs of sum is :"+ pairSum(arr,target));
       // System.out.println("the no of tripletSum of arrays  is :"+ tripletSum(arr,target));
       // System.out.println(" the unique no in an arrays is :"+findUnique(arr));
        System.out.println(" the  Second max in an Arrays is "+ secondMax(arr));
       // System.out.println(" the repeating no in an Arrays is:"+ findRepeatNo(arr));
    }
}
