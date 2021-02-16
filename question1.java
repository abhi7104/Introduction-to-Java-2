abstract class Book{
    abstract void add_books();
    abstract void issue_book();
    abstract void view_book();
}
interface fine{
    void total_fine();
}
class Librarian extends Book{
    void add_books(){
        System.out.println("New Book Added");
    }
    void issue_book(){
        System.out.println("Book Issued");
    }
    void view_book(){
        System.out.println("View Books");
    }
    void collect_fine()
    {
        System.out.println("Fine Collected");
    }

}
class Visiter implements fine{
    void request_book(){
        System.out.println("Request for Issue Book");
    }
    public void total_fine(){
        System.out.println("Total Fine");
    }
    void issued_book()
    {
        System.out.println("All Issued Books");
    }
}
public class question1 {
    public static void main(String[] args) {
        Librarian lib= new Librarian();
        Visiter vis = new Visiter();
        lib.add_books();
        lib.issue_book();
        lib.view_book();
        lib.collect_fine();
        vis.request_book();
        vis.issued_book();
        vis.total_fine();
    }
}
