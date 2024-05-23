package Recursion;

public class SubSet {
    static void SubSetSum(int[] a,int n,int idx,int Sum){
        if(idx>=n){
            System.out.println(Sum);
            return;
        }
        // Include;
        SubSetSum(a,n,idx+1,Sum+a[idx]);
        // Exclude;
        SubSetSum(a,n,idx+1,Sum);
    }
    public static void main(String[] args){
        int [] arr={2,4,5};
        System.out.println("The SubSetSum Of String:");
        SubSetSum(arr,arr.length,0,0);

    }
}
