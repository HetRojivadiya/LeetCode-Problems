class Solution {
    public boolean isHappy(int n) {
        
        int iteration = 10;  
        while (n != 1 ) {
            
            n = getSum(n);
            iteration--;
            if (iteration == 0) {
                break; 
            }
        }
        
        return n == 1;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
        
    
}