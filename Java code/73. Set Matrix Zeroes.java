class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length,n=matrix[0].length;
        int matrix1[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                matrix1[i][j]=matrix[i][j];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<n;k++)
                        matrix1[i][k]=0;
                    for(int k=0;k<m;k++)
                        matrix1[k][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                matrix[i][j]=matrix1[i][j];
    }
    }
}
