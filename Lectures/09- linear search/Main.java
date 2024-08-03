public class Main{
    public static void main(String[] args){
        
        int[] nums = {-9,0,89,56,12,4,10,-5};
        int t = 4;
        // int ans = linearSearch(nums, t);
        // if(ans == -1){
        //     System.out.println("Element not found");
        // }
        // else{
        //     System.out.println("Element at index " + ans);
        // }

        // int ans2 = linearSearch2(nums, t);
        // if(ans2 == -1){
        //     System.out.println("Element not found");
        // }
        // else{
        //     System.out.println("Element found and it is " + ans2);
        // }

        boolean ans3 = linearSearch3(nums, t);
        if(ans3){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }

    }

    // function to return boolean values
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }

    // function to return element found
    static int linearSearch2(int[] arr, int target){
        if(arr.length == -1){
            return -1;
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                return arr[i];
            }
        }

        // advanced for loop
        // for (int element : arr) {
        //     if (element == target) {
        //         return element;
        //     }
        // }

        return -1; // element not found
    }



    // function to return index of element found
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}