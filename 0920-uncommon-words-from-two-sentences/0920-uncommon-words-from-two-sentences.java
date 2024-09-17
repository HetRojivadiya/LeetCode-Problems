class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> l = new ArrayList<>();

        HashMap<String,Integer> hm = new HashMap<>();

        String [] s_1  = s1.split(" ");
        String [] s_2  = s2.split(" ");

        for(int i=0;i<(s_1.length>s_2.length?s_1.length:s_2.length);i++)
        {
            if(s_1.length>i)
            {
                hm.put(s_1[i],hm.getOrDefault(s_1[i],0)+1);
            }

            if(s_2.length>i)
            {
                hm.put(s_2[i],hm.getOrDefault(s_2[i],0)+1);
            }
        }

        for(Map.Entry<String,Integer> entry : hm.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()==1)
            {
                l.add(entry.getKey());
            }
        }
        
        String result[] = l.toArray(new String[l.size()]);
        return result;
    }
}