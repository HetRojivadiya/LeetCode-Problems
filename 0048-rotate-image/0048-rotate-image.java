class Solution {
    public void rotate(int[][] matrix) {
        
        int result [][] = new int[matrix.length][matrix[0].length];
        
        int x=0;
        int y=0;
        
        for(int i=0;i<matrix.length;i++)
        {
            x=matrix.length-1;
        
            for(int j=0;j<matrix[0].length;j++)
            {
                result[i][j]= matrix[x][y];
                x--;
            }
            y++;
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=result[i][j];
            }
        }
        
       
    }
}
