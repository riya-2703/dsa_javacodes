// q: Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to compare: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = Math.max(a,b);

        System.out.println("The largest number is: " + result);
    }
}
