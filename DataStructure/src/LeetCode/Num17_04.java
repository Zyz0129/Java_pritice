package LeetCode;

import java.util.Arrays;

public class Num17_04 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }
}