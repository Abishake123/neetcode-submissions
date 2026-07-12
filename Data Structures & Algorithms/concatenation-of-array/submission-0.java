class Solution {
    public int[] getConcatenation(int[] nums) {

        int numsLen = nums.length;

        int[] newNums = new int[numsLen * 2];

        for(int i = 0; i < numsLen; i++){
            newNums[i] = nums[i];
            newNums[i + numsLen] = nums[i];
        }

        return newNums;
        
    }
}