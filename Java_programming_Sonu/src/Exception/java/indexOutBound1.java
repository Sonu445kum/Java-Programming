package Exception.java;

public class indexOutBound1 {
    static void print(int[] arr, int n) {
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[6]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("hello i m here");
        }
    }
        public static void main(String[]args){
            int n = 5;
            int[] arr = new int[n];
            try {

                print(arr, n);
            } catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println("hello i m here");
            }
        }
    }

