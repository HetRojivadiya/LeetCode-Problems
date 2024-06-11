class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int index=0;
        
        for(int i=0;i<arr2.length;i++)
        {
            int j=0;
            while(j<arr1.length)
            {
                if(arr1[j]==arr2[i])
                {
                    int temp = arr1[index];
                    arr1[index]=arr1[j];
                    arr1[j]=temp;
                    index++;
                }
                j++;
            }         
        }
        
        System.out.println(index);
        for(int i=index;i<arr1.length-1;i++)
        {
            for(int j=index;j<arr1.length-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        
        return arr1;
     
    }
}