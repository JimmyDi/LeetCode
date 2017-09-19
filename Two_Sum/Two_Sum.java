import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] index= new int[2];
        for (int i=0; i<4;i++)
        {
        System.out.println(" " + nums[i]);
        } 
        System.out.println("target is: "+ target);
        Solution go = new Solution();
        index = go.twoSum(nums,target);
        for(int _index:index){
            System.out.println("index is:" + _index);
        }

    }
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int result = 0;
        int[] final_result = new int[2];
        for (int i =0; i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                result = nums[i] + nums[j];
                if (result == target)
                {
                    final_result[0]=i;
                    final_result[1]=j;
                    break;
                }
                else
                    result =0;
            }
        }
        return final_result;
    }
}