package Sort_Algorithm;

public class Merge_Sort {
    static void PrintArrays(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;// n1 is size for left arrays;
        int n2=r-mid;// n2 is size for right arrays;
        int[] left=new int[n1];// create left array with size n1;
        int[] right=new int[n2];//create right array with size n2;
        int i,j,k;
        for(i=0; i<n1; i++) left[i]=arr[l+i];// copy value from main arr to left arr;
        for(j=0; j<n2; j++) right[j]=arr[mid+1+j];// copy value from main arr to right arr;
        i=0;
        j=0;
        k=l;
        // to check condition;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void mergeSort(int[] arr,int l,int r){
        int mid=(l+r)/2;
        if(l>=r) return;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args){
        int[] arr={7,3,4,5,9,2};
        int n=arr.length;
        System.out.println("The original Arrays :");
        PrintArrays(arr);
        mergeSort(arr,0,n-1);
        System.out.println("The Sorted Arrays :");
        PrintArrays(arr);


    }
}
