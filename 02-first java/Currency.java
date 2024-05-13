// q: Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter currency in rupees: ");
        float in = sc.nextFloat();

        double usd = in * 84.3;

        System.out.println("In usd: " + usd);

    }
}
