public class SearchInRange {
    public static void main(String[] args){

        int[] nums = {-9,87,67,54,90,101,2,3,45};
        int target = 101;
        int ans = searchinrange(nums, 2, 6, target);
        if(ans == -1){
            System.out.println("Element not found in the given range");
        }
        else{
            System.out.println("Element found at index " + ans);
        }
    }

    static int searchinrange(int[] arr, int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
