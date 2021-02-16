
class Single{
    private static Single single_instance = null;
    public String str;
    private Single()
    {
        str = "private constructor";
    }
    public static Single getInstance()
    {
        if(single_instance == null)
        {
            single_instance = new Single();
        }
        return single_instance;
    }
}
public class question4 {
    public static void main(String[] args) {
        Single a = Single.getInstance();
        Single b = Single.getInstance();
        a.str = (a.str).toUpperCase();
        System.out.println("A object value "+a.str);
        System.out.println("B object value " + b.str);
    }
}