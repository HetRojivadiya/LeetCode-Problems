class Solution {
    public long pickGifts(int[] gifts, int k) {

        long sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : gifts)
        {
            sum+=n;
            pq.add(n);
        }

        long r = 0;
        for(int i=0;i<k;i++)
        {
            int curr = pq.poll();

            int temp = (int)Math.sqrt(curr);

            r+=curr-temp;

            pq.add(temp);
        }

        return sum-r;


        
    }
}