import java.io.Console;

public class question6 {
    public static void main(String[] args) {
        try{
           int[] num ={1, 0};
           int res=num[0]/num[1];
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out fo bound"+e);
        }
        catch(Exception e)
        {
            System.out.println("Something sent wrong"+e);
        }
        finally {
            System.out.println("Exception Resolved");

        }
    }
}
