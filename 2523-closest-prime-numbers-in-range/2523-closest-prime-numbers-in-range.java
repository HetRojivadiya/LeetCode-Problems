class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isPrime(i))
            {
                l.add(i);
            }
        }
        
        int min=Integer.MAX_VALUE;
        int []pair = new int[]{-1,-1};
        for(int i=0;i<l.size()-1;i++)
        {
            if((l.get(i+1)-l.get(i))<min)
            {
                pair[0]=l.get(i);
                pair[1]=l.get(i+1);
                min=l.get(i+1)-l.get(i);
            }
        }
        return pair;
    }
    public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    if (num <= 3) {
        return true;
    }
    if (num % 2 == 0 || num % 3 == 0) {
        return false;
    }
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}
}