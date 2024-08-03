public class CountNums {
    public static void main(String[] args) {
        int n = 1234532522;

        // q: count the number of 2's in the number
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem==2){
                count++;
            }
            n /= 10;
        }

        System.out.println("Number of times 2 appeared is: " + count);
    }
}
