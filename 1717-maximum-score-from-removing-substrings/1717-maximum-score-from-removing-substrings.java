class Solution {
  
        String rs = "";
    public int maximumGain(String s, int x, int y) {
        int total = 0;

        if (x > y) {
            total += removePairs(s, 'a', 'b', x);
            total += removePairs(rs, 'b', 'a', y);
        } else {
            total += removePairs(s, 'b', 'a', y);
            total += removePairs(rs, 'a', 'b', x);
        }

        return total;
    }

    private int removePairs(String s, char first, char second, int value) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                score += value;
            } else {
                stack.push(c);
            }
        }

       
        StringBuilder remaining = new StringBuilder();
        while (!stack.isEmpty()) {
            remaining.append(stack.pop());
        }
        remaining.reverse();

       
        rs = remaining.toString();

        return score;
    }
}
