package Array;

import java.util.Scanner;

public class Spiral_order {
    static void  Spiral(int[][] Matrix, int r, int c) {
        int TopRow = 0, BottomRow = r - 1, LeftCol = 0, RightCol = c - 1;
        int totalElement = 0;
        while (totalElement < r * c) {
            // topRow=leftCol to RightCol;
            for (int j = LeftCol; j <= RightCol && totalElement < r * c; j++) {
                System.out.print(Matrix[TopRow][j]+" ");
                totalElement++;
            }
            TopRow++;
            // rightCol=topRow to BottomRow;
            for (int i = TopRow; i <= BottomRow && totalElement < r * c; i++) {
                System.out.print(Matrix[i][RightCol]+" ");
                totalElement++;
            }
            RightCol--;
            // BottomRow= RightCol to LeftCol;
            for (int j = RightCol; j >= LeftCol && totalElement < r * c; j--) {
                System.out.print(Matrix[BottomRow][j]+" ");
                totalElement++;
            }
            BottomRow--;
            // leftCol=BottomRow to TopRow;
            for (int i = BottomRow; i >= TopRow && totalElement < r * c; i--) {
                System.out.print(Matrix[i][LeftCol]+" ");
                totalElement++;
            }
            LeftCol++;
        }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of R1:");
        int r = sc.nextInt();
        System.out.println("Enter the No of C1:");
        int C = sc.nextInt();
        int[][] Matrix = new int[r][C];
        int total = r * C;
        System.out.println("Enter Size Of Element:" + total);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < C; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix are:");
        PrintMatrix(Matrix);
        System.out.println(" Spiral order Matrix :");
        Spiral(Matrix,r,C);
    }
}
