class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;

        int[][] answer=new int[col][rows];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                answer[j][i]=matrix[i][j];
            }
        }

    return answer;
    }
}