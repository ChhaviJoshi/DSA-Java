package slidingWindow.fixsize;

public class FixedSize {
    public static int maxSumSubarray(int[] nums,  int k) {
        if(k > nums.length) return -1;

        int left = 0, right = 0, sum = 0, maxSum = Integer.MIN_VALUE;

        for(right = 0; right < k; right++) {
            sum += nums[right];
            maxSum = Math.max(sum, maxSum);
        }

        while(right < nums.length) {
            sum += nums[right];
            sum -= nums[left];
            maxSum = Math.max(sum, maxSum);

            right++;
            left++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,6,-2};
        System.out.println(maxSumSubarray(nums, 3));
    }
}
