class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        
        int start = 0;
        int end = 0;
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // Palindromes of length 1 and 2
                // For length 1, it's always a palindrome
                // For length 2, both characters must be equal
                // For length 2 or more, check if the characters at the ends are equal and if the substring between them is a palindrome
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLength) {
                        maxLength = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }
        
        return s.substring(start, end + 1);
    }
}
