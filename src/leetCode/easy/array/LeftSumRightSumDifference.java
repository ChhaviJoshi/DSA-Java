package leetCode.easy.array;

import java.util.Arrays;

public class LeftSumRightSumDifference {
    public static int[] leftRightDifference(int[] nums) {
        int[] diff = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            int difference = 0;
            for(int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for(int k = i+1; k < nums.length; k++) {
                rightSum += nums[k];
            }
            difference = Math.abs(leftSum - rightSum);
            diff[i] = difference;
        }

        return diff;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
        //[14,11,6,1,10]
    }
}
