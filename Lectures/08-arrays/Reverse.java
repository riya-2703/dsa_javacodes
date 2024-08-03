import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {12,24,45,67,89};
        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

