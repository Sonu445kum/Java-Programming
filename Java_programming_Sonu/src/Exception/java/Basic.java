package Exception.java;

public class Basic {
    public static void main(String[] args) {

        try
        {
            int i, sum;
            sum = 10;
            for (i = -1; i < 3 ;++i)
                sum = (sum / i);
        }
        catch(ArithmeticException e)
        {
            System.out.print("0");
        }

       finally{
            System.out.println("hi m iron man:");
        }
    }

    }




