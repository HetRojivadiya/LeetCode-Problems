class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        
        boolean negative = (dividend<0) ^ (divisor<0);

        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);


        int count = 0;

        while(dvd>=dvs)
        {
            long tempDvs = dvs , multiple = 1;

            while(dvd>=(tempDvs<<1))
            {
                tempDvs<<=1;
                multiple<<=1;
            }

            dvd-=tempDvs;
            count+=multiple;
        }

        return negative ? -count : count;


    }
}