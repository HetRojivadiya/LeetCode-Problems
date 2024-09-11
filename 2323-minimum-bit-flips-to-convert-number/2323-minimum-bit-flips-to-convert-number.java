class Solution {
    public int minBitFlips(int start, int goal) {

        String s = Integer.toBinaryString(start);
        String e = Integer.toBinaryString(goal);

        int maxLength = Math.max(s.length(), e.length());

        while (s.length() < maxLength) {
            s = "0" + s;
        }

        while (e.length() < maxLength) {
            e = "0" + e;
        }

        int countFlip = 0;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(e.charAt(i)!=s.charAt(i))
            {
                countFlip++;
            }
        }

        return countFlip;
    }
}