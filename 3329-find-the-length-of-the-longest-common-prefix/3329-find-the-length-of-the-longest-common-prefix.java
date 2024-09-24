class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> hs = new HashSet<>();
        int lcp = 0;
        for(int i=0;i<arr1.length;i++)
        {
            String str = String.valueOf(arr1[i]);
            
            for(int j=0;j<str.length();j++)
            {
                String temp="";
                for(int k=0;k<=j;k++)
                {
                    temp+=String.valueOf(str.charAt(k));
                }
                if(hs.add(Integer.parseInt(temp))){

                System.out.print(temp+" ");
                }
            }
          
        }

        for(int i=0;i<arr2.length;i++)
        {
            String str = String.valueOf(arr2[i]);
            
            for(int j=0;j<str.length();j++)
            {
                String temp="";
                for(int k=0;k<=j;k++)
                {
                    temp+=String.valueOf(str.charAt(k));
                }
                //System.out.print(temp+" ");

                if(hs.contains(Integer.parseInt(temp)))
                {
                    if(lcp<temp.length())
                    {
                        lcp=temp.length();
                    }
                }
            }
            System.out.println();
        }
        return lcp;
    }
}