class Solution {
    public int nextBeautifulNumber(int n) {
        
        for(int i=n+1;i<10000000;i++){    
            HashMap<Integer,Integer> map = new HashMap<>();
            boolean zeroFlag = false;
            int num = i;
            while(num > 0){               
                int digit = num % 10;
                num = num / 10;
                if(digit == 0) {
                    zeroFlag = true;
                    break;
                }
                if(map.containsKey(digit)){
                    map.put(digit, map.get(digit) + 1);
                }else{
                    map.put(digit, 1);
                }
            }

            if(!zeroFlag){
                boolean balancedFlag = true;

                for(int j=1;j<=9;j++){         
                    if(map.containsKey(j)){
                        if(map.get(j)!=j){
                            balancedFlag = false;
                        }
                    }
                }

                if(balancedFlag){
                    return i;
                }
            }
        }

        return 0;
    }
}