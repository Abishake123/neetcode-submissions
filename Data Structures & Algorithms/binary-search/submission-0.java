class Solution {
    public int search(int[] nums, int target) {


        int lp = 0;
        int rp = nums.length - 1;
        int mid = 0;

        while(rp >= lp){
            mid = lp + ((rp - lp) / 2);

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                rp = mid - 1;
            }else{
                lp = mid + 1;
            }
        }
        

        System.out.println("Mid : " + mid + " L : " + lp + " R : " + rp);
        return -1;
    }
}
