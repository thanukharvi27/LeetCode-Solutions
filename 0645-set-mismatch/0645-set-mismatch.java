class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate=0;
        int miss=0;
        int[] count=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(count[i]==2){
                duplicate=i;
            }
            if(count[i]==0){
                miss=i;

            }
        }

        return new int[]{duplicate,miss};
    }
}