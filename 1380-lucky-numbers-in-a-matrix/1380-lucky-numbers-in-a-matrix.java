class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans =new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int col=0;

            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean lucky=true;

            for(int r=0;r<matrix.length;r++){
                if(matrix[r][col]>min){
                lucky=false;
                break;
                }

               
            }
             if(lucky){
                    ans.add(min);
                }


        }

        return ans;
    }
}