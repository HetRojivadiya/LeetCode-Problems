class Solution {
    public boolean canConstruct(String s, int k) {
        
        if(s.length()<k)
        {
            return false;
        }

        HashMap<Character,Integer> hm = new HashMap<>();

        for(char c : s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        int oddC = 0;

        for(int freq : hm.values())
        {
            if(freq%2!=0) oddC++;
        }

        return oddC<=k;
    }
}