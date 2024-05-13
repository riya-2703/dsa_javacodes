// q: Take name as input and print a greeting message for that particular name.

import java.time.LocalTime;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String ch = sc.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        if (hour >= 5 && hour < 12) {
            System.out.println("Good morning, " + ch + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon, " + ch + "!");
        } else {
            System.out.println("Good evening, " + ch + "!");
        }
    }
}
