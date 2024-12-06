class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {

        int sum = 0;
        int count=0;

        Set<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }

        for(int i=1;i<=n;i++)
        {
            if(!bannedSet.contains(i))
            {
                if(sum+i<=maxSum)
                {
                    sum+=i;
                    count++;
                }
            }
        }

        return count;
        
    }
}