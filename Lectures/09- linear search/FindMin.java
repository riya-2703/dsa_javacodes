public class FindMin {
    public static void main(String[] args){

        int[] nums = {90, 5, 80, 23, 56, -9, -22, 48, 29};
        System.out.println("Minimum number in the array is " + min(nums));
    }

    static int min(int[] arr){
        int min = arr[0];

        for(int element : arr){
            if(element <min){
                min = element;
            }
        }

        return min;
    }
}
