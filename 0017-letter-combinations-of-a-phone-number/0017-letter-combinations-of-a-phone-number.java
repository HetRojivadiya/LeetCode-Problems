import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        HashMap<String, String> digit = new HashMap<>();

        digit.put("2", "abc");
        digit.put("3", "def");
        digit.put("4", "ghi");
        digit.put("5", "jkl");
        digit.put("6", "mno");
        digit.put("7", "pqrs");
        digit.put("8", "tuv");
        digit.put("9", "wxyz");

        if (digits.length() == 0) {
            return list;
        } else {
            generateCombinations(list, digit, digits, "", 0);
        }

        return list;
    }

    private void generateCombinations(List<String> list, HashMap<String, String> digit, String digits, String current, int index) {
        if (index == digits.length()) {
            list.add(current);
            return;
        }

        String letters = digit.get(digits.substring(index, index + 1));
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(list, digit, digits, current + letters.charAt(i), index + 1);
        }
    }
}
