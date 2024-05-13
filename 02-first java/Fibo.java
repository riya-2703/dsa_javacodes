// q: To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a  number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 1;

        while(count<=num){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.println(b);
        }
    }
}
