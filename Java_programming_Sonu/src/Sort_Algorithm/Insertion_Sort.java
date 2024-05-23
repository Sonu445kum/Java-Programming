package Sort_Algorithm;

public class Insertion_Sort {
    static void Sort(int[] arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int [] arr={9,4,6,8,3};
        Sort(arr);
        System.out.println("The Insertion Sorted Arrays:");
        for(int val:arr){
            System.out.print(val+" ");
        }

    }
}
