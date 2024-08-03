// functions / methods
/*
        return_type name (arguments) {
            // body
            return statement;
        }

     */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();

        // int ans = sum2();
        // System.out.println("The sum is: " + ans);

        System.out.println("The sum is: " + sum3(40,60));
    }

    static int sum3(int n1, int n2){
        int sum = n1+n2;
        return sum;
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        return sum;
    }


    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
