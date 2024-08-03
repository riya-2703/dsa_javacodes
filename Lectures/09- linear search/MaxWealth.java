// leetcode - 1672

public class MaxWealth {
    public static void main(String[] args) {
        
    }

    
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for(int row=0;row<accounts.length; row++){
                int sum = 0;
                for(int col=0; col<accounts[row].length; col++){
                   sum += accounts[row][col];
                }
                if(sum > max){
                    max = sum;
                }
            }
            return max;
        } 
    }

