package Anudeep;

import java.util.Scanner;
class Dis{
    static void Print(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}

public class Two_dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no row:");
        int r = sc.nextInt();
        System.out.println("Enter no col:");
        int c = sc.nextInt();
        Dis d=new Dis();
        int[][] arr=new int[r][c];
        System.out.println("Enter The  Element of Arrays:");
        for(int i=0;i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Original Arrays :");
        d.Print(arr);

    }
}
