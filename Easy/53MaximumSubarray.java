// Dynamic Programming
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
}

// Divide and Conquer
class Solution {
    public int maxSubArray(int[] nums) {
        return dc(nums, 0, nums.length - 1);
    }
    
    private int dc(int[] nums, int low, int high) {
        if(low == high) return nums[low];
        if(low == high - 1) return Math.max(nums[low] + nums[high], Math.max(nums[low], nums[high]));
        
        int mid = (low + high) / 2;
        int lResult = dc(nums, low, mid);
        int rResult = dc(nums, mid + 1, high);
        
        int max = nums[mid];
        int temp = max;
        
        for(int i = mid-1; i >= low; i--) {
            temp += nums[i];
            if(temp > max) max = temp;
        }
        
        temp = max;
        
        for(int j = mid + 1; j <= high; j++) {
            temp += nums[j];
            if( temp > max ) max = temp;
        }
        
        return Math.max(max, Math.max(lResult,rResult));
    }
}