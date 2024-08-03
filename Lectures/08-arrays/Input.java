import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 22;
        arr[3] = 12;
        arr[4] = 89;
        // {23, 45, 22, 12, 89} --> internally stored like this
        System.out.println(arr[3]);

        // input using for loop
        for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
        }

        // output and display
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        // enhanced for loop
        for(int num : arr){
            System.out.println(num); // here num represents the element of the array
        }

        // print using Arrays.toString()
        System.out.println(Arrays.toString(arr));

        // Array of Objects
        String[] str = new String[4];

        for(int i=0; i<str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));
    }
}
