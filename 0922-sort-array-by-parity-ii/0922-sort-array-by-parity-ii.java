class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int Evenindex=0;
        int oddIndex=1;

        int[] newArray=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                newArray[Evenindex]=nums[i];
                Evenindex+=2;
            }
            else{
                newArray[oddIndex]=nums[i];
                oddIndex+=2;
            }
        }

        return newArray;
    }
}