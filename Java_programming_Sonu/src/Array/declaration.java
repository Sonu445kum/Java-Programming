package Array;

class Arrays{
    void SearchIndex(){
        int [] arr={12,23,45,6,7,33,55,90};
        int x=55;
        int ans=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("Found at position of "+" " +x +" is:"+ ans);
    }
    void minOfArrays(){
        int [] arr={12,23,45,6,7,33,55,90};
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println(" The minimum value of arrays is:"+ ans);
    }
    void maxOfArrays(){
        int [] arr={12,23,45,6,7,33,55,90};
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(" The maximum value of arrays is:"+ ans);
    }
    void sumofArrays(){
        int [] arr={12,10,3,4,5};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The Sum Of Arrays is:"+ sum);
    }
    void multi_Arrays(){
        int[][] items={{12,10,23},{100,200,300},{400,500,600}};
       for(int i=0; i<items.length; i++){
           for(int j=0; j<items[i].length; j++){
               System.out.println(items[i][j]);
           }
       }
    }
    void array_demo(){
        int [] age=new int[3];
        float [] weight=new float[3];
        String[] names=new String[3];
        age[0]=20;
        age[1]=21;
        age[2]=25;
       weight[0]=55.8f;
       weight[1]=60.9f;
       weight[2]=80.5f;
       names[0]="Sonu";
       names[1]="Anushka";
       names[2]=" Ashok";
       System.out.println("the age is:");
       for(int i=0; i<age.length; i++){
           System.out.println(age[i]);
       }

       System.out.println("the weight is:");
       for(int i=0; i<weight.length; i++){
           System.out.println(weight[i]);
       }

        System.out.println("the names is :");
       for(int i=0; i<names.length; i++){
           System.out.println(names[i]);
       }

    }
}
public class declaration {
    public static void main(String[] args){
        Arrays obj=new Arrays();

//        obj.array_demo();
//        obj.multi_Arrays();
//            obj.sumofArrays();
//        obj.maxOfArrays();
//        obj.minOfArrays();
        obj.SearchIndex();
    }
}
