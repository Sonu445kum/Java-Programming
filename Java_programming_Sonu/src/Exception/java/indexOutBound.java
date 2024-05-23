package Exception.java;

public class indexOutBound {
    static void Print(int [] arr,int n){
        try{

            for(int i=1; i<=8; i++){
                System.out.println(arr[9]);
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("hello I m Thanos:");
        }
    }
    public static void main(String[] args) {
        int n=5;
        int[]arr= new int[n];

        try{
             Print(arr,5);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Hello Google:");
        }
    }
}
