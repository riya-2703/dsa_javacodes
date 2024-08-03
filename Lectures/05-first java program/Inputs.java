import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       System.out.print("Please enter roll no: ");
       int rollno = s.nextInt();
       System.out.println("Your roll number is " + rollno);

       System.out.print("Please enter name: ");
       String name = s.next();
       System.out.println(name);

       System.out.print("Please enter marks: ");
       float marks = s.nextFloat();
       System.out.println(marks);
    }
}
