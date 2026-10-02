class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
    }


        static boolean binary(int[][] matrix,int row,int cStart,int cEnd,int target){
            while(cStart<=cEnd){
                int mid=cStart+(cEnd-cStart)/2;

                if(matrix[row][mid]==target){
                    return true;
                }
                if(matrix[row][mid]<target){
                   cStart=mid+1;
                }
                else{
                    cEnd=mid-1;
                }
            }

            return false;
        }


        static boolean search(int[][] matrix,int target){
            int row=matrix.length;
            int col=matrix[0].length;

            if(row == 1){
               return binary(matrix,0,0,col-1,target);
            }

            int rStart=0;
            int rEnd=row-1;
            int cMid = (col - 1) / 2;

            while(rStart < rEnd-1){
                int mid=rStart+(rEnd-rStart)/2;
                if(matrix[mid][cMid]==target){
                    return true;
                }
                if(matrix[mid][cMid]<target){
                    rStart=mid;
                }
                else{
                    rEnd=mid;
                }
            }

            if(matrix[rStart][cMid]==target){
               return true;
            }
            if(matrix[rStart+1][cMid]==target){
                 return true;
            }
            if(col == 1){
               return false;
               }

            if(cMid - 1 >= 0 && target>=matrix[rStart][0] && target<=matrix[rStart][cMid-1]){
                 return binary(matrix,rStart,0,cMid-1,target);
            }
            if(cMid + 1 < col && target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1] ){
                 return binary(matrix,rStart,cMid+1,col-1,target);
            }
            if(cMid - 1 >= 0 && target>=matrix[rStart+1][0] && target<=matrix[rStart+1][cMid-1]){
                return binary(matrix,rStart+1,0,cMid-1,target);
            }
            if(cMid + 1 < col && target>=matrix[rStart+1][cMid+1] && target<=matrix[rStart+1][col-1]){
                 return binary(matrix,rStart+1,cMid+1,col-1,target);
            }

            return false;
        }
}
    