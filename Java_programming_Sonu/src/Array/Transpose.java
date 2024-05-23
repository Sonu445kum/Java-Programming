package Array;

import java.util.Scanner;

public class Transpose {
    static int[][] FindTranspose(int[][] Matrix,int r,int C){
        int[][] ans=new int[C][r];
        for(int i=0; i<C; i++){
            for(int j=0; j<r; j++){
                ans[i][j]=Matrix[j][i];
            }
        }
        return ans;
    }
    static void PrintMatrix(int[][] Matrix){
//        int n=arr.length;
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[i].length; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of R1:");
        int r=sc.nextInt();
        System.out.println("Enter the No of C1:");
        int C=sc.nextInt();
        int[][] Matrix= new int[r][C];
        int total=r*C;
        System.out.println("Enter Size Of Element:"+total);
        for(int i=0; i<r; i++){
            for(int j=0; j<C; j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix are:");
        PrintMatrix(Matrix);
        System.out.println(" Transpose of Matrix are:");
       int[][] ans= FindTranspose(Matrix,r,C);
        PrintMatrix(ans);
    }

}
