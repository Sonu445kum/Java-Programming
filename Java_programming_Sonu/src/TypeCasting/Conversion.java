package TypeCasting;

class Typecasting {
    static void Implicit(){
        int a=4;
        double d=(double)a;
        System.out.println("Implicit Function:");
        System.out.println(" The Initial Value of a:");
        System.out.println(a);
        System.out.println(" Conversion Value:");
        System.out.println(d);
    }
    static void Explicit(){
       double d=256.0;
       char ch=(char)d;

        System.out.println("Explicit Function:");
        System.out.println(" The Initial Value of a:");
        System.out.println(d);
        System.out.println(" Conversion Value:");
        System.out.println(ch);
    }
}
public class Conversion {
    public static void main(String[] args) {
        Typecasting tc=new Typecasting();
        tc.Implicit();
        tc.Explicit();
    }
}
