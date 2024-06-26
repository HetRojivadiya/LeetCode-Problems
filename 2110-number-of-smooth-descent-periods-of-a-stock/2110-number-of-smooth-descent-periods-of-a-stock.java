class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long total_count = 0;
        long current_length = 1; 
        
        for (int i = 1; i < n; i++) {
            if (prices[i-1] == prices[i] + 1) {
                current_length += 1;
            } else {
                current_length = 1; 
            }
            total_count += current_length;
        }
        
        return total_count + 1; 
    }
}