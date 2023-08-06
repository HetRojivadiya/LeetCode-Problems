import java.util.Arrays; 
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        if(Arrays.equals(sortedNums, nums)){
            return 0;
        } else {
            int i = 0;
            int j = nums.length - 1;

            while (nums[i] == sortedNums[i]) {
                i++;
            }

            while (nums[j] == sortedNums[j]) {
                j--;
            }

            int[] slicedArray = Arrays.copyOfRange(nums, i, j + 1);
            return slicedArray.length;
        }
    }
}
