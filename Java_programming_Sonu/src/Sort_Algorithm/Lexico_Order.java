package Sort_Algorithm;

public class Lexico_Order {
    static void SortFruits(String[] Fruits){
       int n=Fruits.length;
       for(int i=0; i<n-1; i++){
           int min_Index=i;
           for(int j=i+i; j<n; j++){
               if(Fruits[j].compareTo(Fruits[min_Index])<0){
                   min_Index=j;
               }
           }
           // Swap Fruits[i], Fruits[min_Index];
           String temp=Fruits[i];
           Fruits[i]=Fruits[min_Index];
           Fruits[min_Index]=temp;
       }
    }
    public static void main(String[] args){
        String[] Fruits={"kiwi","apple","papaya","mango"};
        SortFruits(Fruits);
        for(String val:Fruits){
           System.out.print(val+" ");
        }
    }
}
