package Exception.java;
public class ExceptionEx1 {
    static void fun() throws Exception
    {
        System.out.println("jai Shri  ram :");
        throw new Exception("King");
    }
    public static void main(String[] args) {
        try {
            fun();
        }
        catch (Exception e) {
            System.out.println("I m Big Fan of Newton:");
        }
    }
}
