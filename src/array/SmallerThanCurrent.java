package array;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) count++;
            }
            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,4,4,2};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
