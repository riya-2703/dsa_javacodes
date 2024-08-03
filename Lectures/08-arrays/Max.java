public class Max {
    public static void main(String[] args) {
        int[] arr = {23,45,67,89,12};
        System.out.println((maximum(arr)));
        System.out.println(maximumRange(arr,0,2));
    }


    static int maximum(int[] arr){
        
        if(arr.length==0){
            return -1;
        }
        
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    static int maximumRange(int[] arr, int start, int end){
        if(start>end){
            return -1;
        }

        if(arr==null){
            return -1;
        }
                      
        int max=arr[start];

        for(int i=start;i<=end;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    
}
