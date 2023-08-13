class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] vowelCounts = new int[n + 1]; // Count of words that start and end with a vowel up to index i
        int[] result = new int[queries.length];

        for (int i = 1; i <= n; i++) {
            String word = words[i - 1].toLowerCase();
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);

            vowelCounts[i] = vowelCounts[i - 1];

            if (isVowel(firstChar) && isVowel(lastChar)) {
                vowelCounts[i]++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            result[i] = vowelCounts[y + 1] - vowelCounts[x];
        }

        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
