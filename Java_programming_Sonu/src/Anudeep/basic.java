package Anudeep;


class Odd_Even{
    void check_Odd_Even(int a){
        if(a%2==0){
            System.out.println("Even Number:"+a);
        }
        else{
            System.out.println("Odd Number:"+a);
        }
    }
}
class Unary_operator{
    void Pre_Decrement(){
        int a=20;
        int b=--a;
        System.out.println("a="+a+" "+"b="+b);
    }
    void Post_Decrement(){
        int a=20;
        int b=a--;
        System.out.println("a="+a+" "+"b="+b);
    }
    void Pre_Increment(){
        int a=20;
        int b=++a;
        System.out.println("a="+a+" "+"b="+b);
    }
    void Post_Increment(){
        int a=20;
        int b=a++;
        System.out.println("a="+a+" "+"b="+b);
    }
}
class Arithmetic_operation{//sub class3 is here;
    void Mul(int a, int b){
        int res= a*b;
        System.out.println("The Product of two no is :"+res);
    }
    void Modulus(int a, int b){
        int res= a%b;
        System.out.println("The Modulus  of two no is :"+res);
    }
    void Div(int a, int b){
        int res= a/b;
        System.out.println("The Div of two no is :"+res);
    }
    void Sub(int a, int b){
        int res= a-b;
        System.out.println("The Sub of two no is :"+res);
    }
    void Add(int a, int b){
        int res= a+b;
        System.out.println("The Addition of two no is :"+res);
    }
}
class Non_Primitive{//sub class2 is here;
    void string(){
        String names=" Sonu kumar";
        System.out.println(" names is :"+ names);

    }
    void Arrays(){
        int [] arrays={1,2,3,4,5};
        int n=arrays.length;
        System.out.println("the element value is:");
        for(int i=0; i<n; i++){
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }
}
class Primitive_Data{// sub class1 is here;
    void character(){
        char a= 'l';
        System.out.println("character is:"+ a);
    }

    void bool(){
        boolean check= true;
        System.out.println(" check is :"+ check);
    }
    void Doubles(){
        double b=2;
        System.out.println( " The double value  is :"+ b);
    }
    void Integer(){
        int a=10;
        System.out.println(" The integer value is:"+ a);
    }

    void print(){
        System.out.println("I m Learning Java Programming");
    }
}
public class basic {// main class is here;
    public static void main(String[] args){
        Primitive_Data obj=new Primitive_Data();// first object create
        Arithmetic_operation obj1=new Arithmetic_operation();// second object create;
        Non_Primitive obj2=new Non_Primitive();//third object create;
        Unary_operator obj3=new Unary_operator();
        Odd_Even obj4=new Odd_Even();
        obj.print();
        obj1.Add(200,300);
        obj1.Sub(200,30);
        obj1.Mul(12,20);
        obj1.Div(1000,50);
        obj1.Modulus(200,10);
        obj.Integer();
        obj.Doubles();
        obj.bool();
        obj2.string();
        obj.character();
        obj2.Arrays();
        obj3.Pre_Increment();
        obj3.Post_Increment();
        obj3.Pre_Decrement();
        obj3.Post_Decrement();
        obj4.check_Odd_Even(8);


    }
}
