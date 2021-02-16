class student implements Cloneable{
    String name;
    int age;
    student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    student(student stu)
    {
        this.name=stu.name;
        this.age=stu.age;
    }
    void display()
    {
        System.out.println("Name: "+this.name+" Age: "+this.age);
    }
    protected Object clone()throws CloneNotSupportedException
    {
      return super.clone();
    }
}
public class question5 {
    public static void main(String[] args) {
        try{
    student s=new student("abhishek",23);
    student stu =(student)s.clone();
    student cpy=new student(s);
    System.out.println("Name: "+stu.name+" Age: "+stu.age);
    s.display();
    cpy.display();}
        catch (CloneNotSupportedException e)
        {
            System.out.println("Exception catched"+e);
        }
    }
}
