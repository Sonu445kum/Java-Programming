package Sort_Algorithm;

public class Selection_Sort {
    static void Sort(int []arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int min_Index=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_Index]){
                    min_Index=j;
                }
            }
            // Swap current Element and minimum element
            // arr[min_index],arr[i];
            int temp=arr[i];
            arr[i]=arr[min_Index];
            arr[min_Index]=temp;
        }
    }
    public static void main(String[] args){
        int [] arr={7,3,5,6,2};
        Sort(arr);
        System.out.println(" The Selection Sort Arrays:");
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
