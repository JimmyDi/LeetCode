// Devide and Conquer(self-made)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];
        
        int mid = nums.length / 2;
        int left = 0, right = 0;
        for(int i = 0; i< mid; i++){
            left = left + nums[i];
        }
        for(int i = mid; i < nums.length; i++){
            right = right + nums[i];
        }
        if(left < right) return right;
        else return left;
    }
}

