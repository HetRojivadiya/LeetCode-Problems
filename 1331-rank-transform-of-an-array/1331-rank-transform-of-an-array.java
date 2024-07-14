class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        if (arr.length == 0) return new int[0];

        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : arr) {
            sortedSet.add(num);
        }

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedSet) {
            rankMap.put(num, rank++);
        }

    
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}