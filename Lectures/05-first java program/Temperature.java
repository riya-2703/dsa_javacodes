import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter temp in degree celsius: ");
        float c = s.nextFloat();

        float f = (c * 9/5) + 32;
        System.out.println("Temperature in degree fahrenheit is: " + f);
    }
}
