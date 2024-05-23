package Array;

import java.util.Scanner;

public class Generate {
        static int[][] GenerateSpiral( int n){
            int[][]Matrix=new int[n][n];
        int TopRow = 0, BottomRow = n - 1, LeftCol = 0, RightCol = n - 1;
        int curr = 1;
        while (curr <= n * n) {
            // topRow=leftCol to RightCol;
            for (int j = LeftCol; j <= RightCol && curr <= n*n; j++) {
                Matrix[TopRow][j] =curr++;
            }
            TopRow++;
            // rightCol=topRow to BottomRow;
            for (int i = TopRow; i <= BottomRow && curr <=n*n; i++) {
                Matrix[i][RightCol]=curr++;
            }
            RightCol--;
            // BottomRow= RightCol to LeftCol;
            for (int j = RightCol; j >= LeftCol && curr <= n*n; j--) {
                Matrix[BottomRow][j]=curr++;
            }
            BottomRow--;
            // leftCol=BottomRow to TopRow;
            for (int i = BottomRow; i >= TopRow && curr <=n*n; i--) {
                Matrix[i][LeftCol]=curr++;
            }
            LeftCol++;
        }
        return Matrix;
    }
        static void PrintMatrix ( int[][] Matrix){
//        int n=arr.length;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int[][] Matrix=GenerateSpiral(n);
        PrintMatrix(Matrix);
    }
    }
