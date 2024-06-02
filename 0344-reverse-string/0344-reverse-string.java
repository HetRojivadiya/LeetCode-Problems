class Solution {
    public void reverseString(char[] s) {
        
        char[] ns = new char[s.length];
        
        int j = 0;
        int i = s.length - 1;
        while (j < s.length) {
            ns[j++] = s[i--];
        }
        
        for (i = 0; i < s.length; i++) {
            s[i] = ns[i];
        }
        
    }
}