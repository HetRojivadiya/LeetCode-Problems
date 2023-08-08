class Solution {
    public int[] closestDivisors(int num) {
        for (int i = 1 + (int)Math.floor(Math.sqrt(num)); i > 1; --i) {
            if ((num + 1) % i == 0) {
                return new int[]{i, (num + 1) / i};
            }else if ((num + 2) % i == 0) {
                return new int[]{i, (num + 2) / i};
            }
        }
        return new int[]{1, num + 1};
    }
}