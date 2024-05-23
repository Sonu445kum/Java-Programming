package BinarySearch;

public class RotatedSortedArr {
    static int Search(int[] arr, int target){
        int n=arr.length;
        int st=0; int end= n-1;
        while(st<=end){
             int mid= st+ (end-st)/2;
             if(arr[mid]==target){
                 return mid;
             }
            else  if(arr[mid]<arr[end]){ // mid to end are Sorted Array;
                 if(target>arr[mid] && target<=arr[end]){
                     st=mid+1;
                 }
                 else{
                     end=mid-1;
                 }
             }
            else{
                if(target>=arr[st] && target<arr[mid]){ // start to mid are Sorted Array;
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int target=2;
        System.out.println("The Element are Present at Index:"+Search(arr,target));
    }
}
