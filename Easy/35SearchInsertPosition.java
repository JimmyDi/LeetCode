// Myself
class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        boolean flag = false;
        for (int i=0; i < nums.length; i++){
            if(nums[i] == target) return i;
            if(nums[i] > target && flag ==false) {
                flag = true;
                pos = i;
            }
            if(i == nums.length-1 && nums[i] < target) {
                return nums.length;
            }
        }
        return pos;
    }
}

// Binary Search
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}