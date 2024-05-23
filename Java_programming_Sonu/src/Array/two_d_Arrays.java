package Array;
import java.util.Scanner;
public class two_d_Arrays {
    static void MultiplyMatrix(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println(" Wrong Input ");
            return;
        }
        int[][] Mul=new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    Mul[i][j]=a[i][k] * b[k][j];
                }
            }
        }
        System.out.println(" The Multiplication two Matrix:");
        PrintMatrix(Mul);
    }
    static void AddToMatrix(int[][] a,int r1,int c1,int[][] b,int r2,int c2){

        if(r1!=r2|| c1!=c2){
            System.out.println("Wrong Input ");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j]= a[i][j]+ b[i][j];

            }
        }
        System.out.println(" Sum of matrix1 and Matrix2");
        PrintMatrix(sum);
    }
    static void PrintMatrix(int[][] arr){
//        int n=arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of R1:");
        int r1=sc.nextInt();
        System.out.println("Enter the No of C1:");
        int C1=sc.nextInt();
        int[][] a= new int[r1][C1];
        System.out.println(" Enter the value of first Matrix  :");
        for(int i=0; i<r1; i++){
            for(int j=0;j<C1; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the No of R2:");
        int r2=sc.nextInt();
        System.out.println("Enter the No of C2:");
        int C2=sc.nextInt();
        int[][] b= new int[r2][C2];
        System.out.println(" Enter the value of Second Matrix  :");
        for(int i=0; i<r2; i++) {
            for (int j = 0; j < C2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
      // System.out.println("The original value of 2-d Arrays is: ");
        System.out.println("Print the value of matrix1:");
        PrintMatrix(a);
        System.out.println("Print the value of matrix2:");
        PrintMatrix(b);
       // AddToMatrix(a,r1,C1,b,r2,C2);
        MultiplyMatrix(a,r1,C1,b,r2,C2);
    }
}
