package Array;
import java.util.Scanner;
public class Rectangle_Sum {
    static int FindSum(int[][] Matrix,int l1,int r1,int l2, int r2){
        int sum=0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum+=Matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number of Row and Columns of a Matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]Matrix=new int[r][c];
        int totalElement=r*c;
        System.out.println("Enter"+" "+ totalElement+" "+"values:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Rectangle Boundaries: l1,r1,l2,r2");
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("sum of rectangle is:"+FindSum(Matrix,l1,r1,l2,r2));
    }
}
