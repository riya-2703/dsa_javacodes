// q: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        float p = sc.nextFloat();

        System.out.println("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.println("Enter number of years: ");
        int n = sc.nextInt();

        float si = (p * n * r)/100;

        System.out.println("Simple interest is : " + si);
    }
}
