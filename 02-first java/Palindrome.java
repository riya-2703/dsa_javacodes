// q: To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int num = n;
        int ans = 0;

        while(n>0){
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }

        if(ans == num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
