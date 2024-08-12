class KthLargest {
    
    public int k;
    public List<Integer> l = new ArrayList<>();

    public KthLargest(int k, int[] nums) {
        this.k=k;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
    }
    
    public int add(int val) {
        l.add(val);
        Collections.sort(l);
        
        // System.out.print(l);
        // System.out.println(l.get(l.size()-k));
        return l.get(l.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */