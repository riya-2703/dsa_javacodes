import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
          1 2 3 
          4 5 6
          7 8 9
         */

         int[][] arr = new int[3][3]; // no of columns not necessary to specify
         // no of rows is mandatory , columns is optional 

         // or
         int[][] arr2D = {
            {1,2,3}, //0th index
            {4,5}, // 1st index
            {6,7,8,9} // 2nd index
         };
         // its a array of arrays

         // individual array can vary in size and hence no of columns is not necessary
         // arr2d.length will give number of rows
         //input
         for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
         }

         //output
         for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
         }

         // Arrays.toString()
         //output
         for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
         }

         for(int[] a: arr2D){
            System.out.println(Arrays.toString(a));
         }




    }
}
