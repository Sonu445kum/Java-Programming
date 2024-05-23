package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Scanner;
// sub cls;
class Find_Freq{
    public int frequency(ArrayList<Integer> arr, int x){
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x){
                count++;
            }
        }
        return count;
    }
    static void Display(ArrayList<Integer> arr){
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}
// main class:
    public class Frequency {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<>();
        System.out.println("Enter the Size of Elements:");
        int n=sc.nextInt();
        // initialize the value;
        System.out.println("Enter the elements of An Arrays:");
        for(int i=0; i<n; i++){
            al.add(sc.nextInt());
        }
        Find_Freq ff=new Find_Freq();
            System.out.println("The elements of ArrayList:");
       ff.Display(al);
        System.out.println("Enter the target:");
        int x=sc.nextInt();
        int ans=ff.frequency(al,x);
        System.out.println("The frequency of "+x+" :"+ans);
    }
}
