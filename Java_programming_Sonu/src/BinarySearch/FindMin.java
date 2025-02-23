package BinarySearch;

public class FindMin {
    static int Min(int[] arr){
        int n=arr.length-1;
        int st=0;
        int end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println("Minimum Value:"+Min(arr));
    }
}
