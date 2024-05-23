package Array;
import java.util.Scanner;

public class two_Pointer {
    static int FindSumArrays(int[] arr){
        int totalSum=0;

        for(int i=0;i<arr.length; i++){
          totalSum=totalSum+ arr[i];
        }
        return totalSum;
    }
    static boolean EqualPartition(int [] arr){
        int totalSum=FindSumArrays(arr);
        int prefixSum=0;
        for(int i=0; i<arr.length; i++){
            prefixSum+=arr[i];
          int   SuffixSum=totalSum-prefixSum;
          if(SuffixSum==prefixSum){
              return true;
          }
        }
        return false;
    }
    static int[] PrefixSumArrays(int[] arr){
        int n=arr.length;
        for(int i=1 ; i<n; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    static void  reverseArrays(int[] arr){
        for(int i=arr.length-1; i>=0; i--){

            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] SortedBySqrt(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int[] ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){

                ans[k++]=arr[left]*arr[left];
                  left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    static void SortByParioty(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                Swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    static void Sort_0_1(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                Swap(arr,left,right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
//    static void Sort_0_1(int[] arr){
//        int n=arr.length;
//        int count=0;
//        for(int i=0; i<n; i++){
//            if(arr[i]==0){
//                count++;
//            }
//        }
//        // loop travel for whole arrays;
//        for(int i=0; i<n; i++){
//            if(i<count){
//                arr[i]=0;
//            }
//            else{
//                arr[i]=1;
//            }
//        }
//    }
    static void Swap(int[] arr ,int i,int j){
        int n=arr.length;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void PrintArrays(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Element:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter"+ " "+n +" "+"Element:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original Arrays is:");
        PrintArrays(arr);
//        System.out.println(" Swap element of arrays is:");
//        Swap(arr,0,n-1);
//        PrintArrays(arr);
//        System.out.println(" The Sorted  arrays is:");
//        Sort_0_1(arr);
//        System.out.println("number are placed at odd to even:");
//        SortByParioty(arr);
//        int[] ans= SortedBySqrt(arr);
//        System.out.println("the element are Sorted by Decreasing:");

//        PrintArrays(ans);
//        System.out.println("the element are Sorted by in     creasing:");
//        reverseArrays(ans);
//        int[] prefix=PrefixSumArrays(arr);
//        System.out.println(" the PrefixSumArrays are:");
//        PrintArrays(prefix);
//        System.out.println("Enter the No of Query:");
//        int q=sc.nextInt();
//       while(q-->0){
//           System.out.println("Enter the Starting no:");
//           int l=sc.nextInt();
//           System.out.println("Enter the Last  no:");
//           int r=sc.nextInt();
//          int ans=prefix[r]-prefix[l-1];
//          System.out.println("Sum of Range:"+ ans);
//       }

        System.out.println("Partition of Arrays is:"+EqualPartition(arr));

    }
}
