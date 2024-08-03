import java.util.Scanner;

public class Largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers to compare which one is the largest: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // shortcut method
       // int max = Math.max(c,Math.max(a,b));

       int max = a;
       if(b>max){
        max = b;
       }
       if(c>max){
        max = c;
       }

       System.out.println("Largest number is: " + max);

       
//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }

        }
}