package Recursion;
import java.util.ArrayList;
public class RecursionArrays {
    // Find return all indices of Arrays:
    static ArrayList<Integer> FindAllIndex(int[]arr,int target,int idx){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(idx>=arr.length){
            return ans;
        }
        if(arr[idx]==target){
            ans.add(idx);
        }
        // Recursive Call;
        ArrayList<Integer> SmallAns=FindAllIndex(arr,target,idx+1);
        ans.addAll(SmallAns);
        return ans;
    }
    // Find index of Arrays if Element are Present or Not:
    static  int  FindIndex(int[] arr,int target,int idx){
        // Base Case;
        if(idx>=arr.length){
            return -1;
        }
        // Self Work;
        if(arr[idx]==target){
            return idx;
        }
        // Recursive Call;
        return FindIndex(arr,target,idx+1);

    }
    //  Find true or False of Arrays if Element are Present or Not:
    static  boolean Search(int[] arr,int target,int idx){
        // Base Case;
        if(idx>=arr.length){
            return false;
        }
        // Self Work;
        if(arr[idx]==target){
            return true;
        }
        // Recursive Call;
        return Search(arr,target,idx+1);

    }
    static int SumOfArrays(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        // Recursive Call;
        int small=SumOfArrays(arr,idx+1);
        // Self Work;
        return small+arr[idx];
    }
    static int mxArrays(int[] arr,int idx){
        // Base Case;
        if(idx==arr.length-1){
            return arr[idx];
        }
        // Self Work;
        int smallPro=mxArrays(arr,idx+1);
        // recursive Problem;
        return Math.max(smallPro,arr[idx]);
    }
    static void PrintArrays(int[] arr,int idx){
        // Base case;
        if(idx==arr.length){
            return;
        }
        // Self Work;
        System.out.println(arr[idx]);
        // Recursive Call;
        PrintArrays(arr,idx+1);
    }
    public static void main(String[] args){
        int [] arr={10,200,30,200,200};
        int target=200;
      //  PrintArrays(arr,0);
//      int ans=  mxArrays(arr,0);
//      System.out.println("Max Element Of Arrays Is:"+ ans);
//        int ans=SumOfArrays(arr,0);
//        System.out.println("Sum Of Arrays Is:"+ ans);
//        if(Search(arr,target,0)){
//            System.out.println("The Element are Present:");
//        }
//        else{
//            System.out.println("The Element are not Present:");
//        }
//        int ans=FindIndex(arr,target,0);
//        System.out.println("Element Found at Position:"+ans);
        ArrayList<Integer> ans=FindAllIndex(arr,target,0);
        System.out.println("The indices of all Element in An Arrays:"+ans);

    }
}
