public class FindMax {
    public static void main(String[] args) {
        int[] nums = {90, 5, 80, 23, 56, -9, -22, 48, 29};
        System.out.println("Maximum number in the array is " + max(nums));
    }

    static int max(int[] arr){
        int max = arr[0];

        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }
}
