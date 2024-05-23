package Array;

public class input1_Arrays {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void changeArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args){
        int[] arr=new int [3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        changeArray(arr);
        printArray(arr);
    }
}
