// q: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter a operator +, -, * , / (X or x to exit): ");
        char op = sc.next().trim().charAt(0);

        int ans = 0;

        while(true){
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                if(op == '+'){
                   ans = a + b;
                }
                if(op=='-'){
                    ans = a - b;
                }
                if(op=='*'){
                    ans = a*b;
                }
                if(op=='/'){
                    ans = a/b;
                }
            }
            else if(op == 'x' || op =='X'){
                return;
            }
            else{
                System.out.println("Invalid operator");
                return;
            }
        }
    }
}
