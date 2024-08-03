import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        // Q: Print numbers from 1 to 5
        // for(int i=1; i<=5; i++){
        //     System.out.println(i);
        // }

        // Q: Print numbers from 1 to n
        // System.out.println("Enter the value of n: ");
        // int n = sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     System.out.println(i);
        // }

        // While loops syntax
         /*
            Syntax:
            while (condition) {
                // body
            }
         */

         // Q: print first 5 numbers
        //  int num=1;
        //  while(num<=5){
        //     System.out.println(num);
        //     num++;
        //  }

        // Do while loops syntax
        /*

            do {
                // body
            } while (condition);

         */

         int n = 1;
         do {
             System.out.println("Hello World");
             n++;
         } while (n<=5); 
    }
}
