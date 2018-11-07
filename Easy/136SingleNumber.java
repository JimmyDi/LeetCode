package DailyTest;

import java.util.LinkedList;
import java.util.List;

public class _136SingleNumber {
	
	public static int singleNumber(int[] nums) {
		List<Integer> list = new LinkedList<>();
        int size = nums.length;
        
        for(int i = 0; i < size; i++) {
            int position = list.indexOf(nums[i]);
            if(position == -1) list.add(nums[i]);
            else list.remove(position);
        }
        
        Integer result = list.get(0);
        return result; 
	}
	 
	public static int singleNumber2(int[] nums) {
		int result = 0;
		int size = nums.length;
        
        for(int i = 0; i < size; i++) {
            result ^= nums[i];
        }
        
        return result; 
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,4,3,4,6,8,8,3};
		int result = _136SingleNumber.singleNumber2(nums);
		System.out.println(result);
	}
}