class myage extends Exception
{
    myage(String msg){
        super(msg);
    }
}

class testage{
    void test( int a)throws myage
    {
        if((a<0))
        {
            throw new myage("Invalid age");
        }
        else {
            System.out.println("Valid age");
        }
    }
}

public class question13 {
    public static void main(String[] args) {
        testage t= new testage();
        try
        {
        t.test(-1);
        }
        catch (myage e)
        {
            System.out.println(e);
        }
    }
}
