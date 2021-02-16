class  sample{
    void showData()
    {
        System.out.println("sample data");
    }
}
class sample1 extends sample{
    void show(){
        System.out.println("Child class");
    }
}

public class question3 {
    private static final String toLoad="java.lang";
    public static void main(String[] args) {
        sample1 data = new sample1();
        data.showData();
        data.show();
    }
}
