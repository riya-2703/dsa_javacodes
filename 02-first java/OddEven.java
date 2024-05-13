// q: Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;


public class OddEven{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}