package Sort_Algorithm;

public class Bubble_Sort {
    static void Sort(int[] a){
        int n=a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(a[j]>a[j+1]){
                    int   temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={7,4,5,3,9};
        Sort(arr);
        System.out.println("The Sorted Arrays is:");
        for(int i:arr){
            System.out.print(+i+" ");
        }
    }
}


