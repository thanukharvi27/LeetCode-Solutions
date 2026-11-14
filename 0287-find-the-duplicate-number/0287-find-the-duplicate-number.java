class Solution {
    public int findDuplicate(int[] nums) {
        int currentInd=0;
        int i=0;
        while(i<nums.length){
            currentInd=nums[i]-1;
            if(nums[i]==nums[currentInd]){
                if(i!=currentInd){
                    return nums[i];
                }
                i++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[currentInd];
                nums[currentInd]=temp;
            }
        }

        
    return -1;
    }
}