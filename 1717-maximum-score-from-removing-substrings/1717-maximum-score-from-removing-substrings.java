class Solution {
    public int maximumGain(String s, int x, int y) {
        int total = 0;
        
        if (x < y) {
            // Swap the values of x and y and swap the characters
            total = maximumGain(s.replace('a', '\0').replace('b', 'a').replace('\0', 'b'), y, x);
            return total;
        }
        
        // Maximize "ab" pairs first
        Stack<Character> stack1 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == 'b' && !stack1.isEmpty() && stack1.peek() == 'a') {
                stack1.pop();
                total += x;
            } else {
                stack1.push(c);
            }
        }
        
        // Convert stack back to string
        StringBuilder remaining = new StringBuilder();
        while (!stack1.isEmpty()) {
            remaining.append(stack1.pop());
        }
        remaining.reverse();
        
        // Maximize "ba" pairs
        Stack<Character> stack2 = new Stack<>();
        for (char c : remaining.toString().toCharArray()) {
            if (c == 'a' && !stack2.isEmpty() && stack2.peek() == 'b') {
                stack2.pop();
                total += y;
            } else {
                stack2.push(c);
            }
        }
        
        return total;
    }
}
