class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0]==b[0] ? Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0])
        );

        for(int  i=0;i<nums.length;i++)
        {
             pq.add(new int[]{nums[i], i});
        }

        for(int i=0;i<k;i++)
        {
            int temp[] = pq.poll();

            nums[temp[1]] = temp[0]*multiplier;

            pq.add(new int[]{temp[0]*multiplier,temp[1]});
        }

        return nums;
        
        
    }
}