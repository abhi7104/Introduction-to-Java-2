public class question3_b {
    public static void main(String[] args) {
        try{
            Class.forName("NoName");
        }
        catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException: "+e.getMessage());
        }
    }
}
