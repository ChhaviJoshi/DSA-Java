package leetCode.medium;

public class MaxPairValidSum {
    public static int maxValidPairSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int left = nums[0];

        for(int j = k; j < nums.length; j++) {
            left = Math.max(left, nums[j - k]);
            maxSum = Math.max(maxSum, left + nums[j]);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(maxValidPairSum(nums, 2));
    }
}
