class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int[] result = new int[2];
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; int right = numbers.length - 1;
        while(numbers[left] + numbers[right] != target) {
            if(numbers[left] + numbers[right] > target) right--;
            else left++;
        }
        return new int[]{left + 1, right + 1};
    }
}