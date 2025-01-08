class Solution {
    public int countPrefixSuffixPairs(String[] words) {

        int count = 0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                String currStr = words[i];
                String checkStr = words[j];

                System.out.print(currStr);
                System.out.print(checkStr);

                if(currStr.length()<=checkStr.length())
                {   
                    boolean flag = false;
                    for(int k=0;k<currStr.length();k++)
                    {
                        if(currStr.charAt(k)!=checkStr.charAt(k))
                        {
                            flag=true;
                            break;
                        }
                    }

                    int checkIndex = checkStr.length()-1;
    
                    for(int k=currStr.length()-1;k>=0;k--)
                    {
                        if(currStr.charAt(k)!=checkStr.charAt(checkIndex))
                        {
                            flag=true;
                            break;
                        }
                        checkIndex--;
                    }

                    if(!flag)
                    {
                        count++;
                    }

                }
            }
        }
        return count;
    }
}