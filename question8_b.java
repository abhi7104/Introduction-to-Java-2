import java.util.Scanner;

public class question8_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        do
        {
            if(str.charAt(0)==str.charAt(str.length()-1))
            {
                System.out.println("First and last character are equal");
            }
            else {
                System.out.println("First and last character are not equal");
            }
            str=sc.next();
        }while(!str.equals("done"));
    }
    }
