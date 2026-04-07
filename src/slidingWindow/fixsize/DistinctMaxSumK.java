package slidingWindow.fixsize;

import java.util.HashSet;

public class DistinctMaxSumK {
    public static long maximumSubarraySum(int[] nums, int k) {
        if(k > nums.length) return 0;

        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        long sum = 0, maxSum = 0;

        for(int right = 0; right < nums.length; right++) {

            while(set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];

            if(right - left + 1 == k) {
                maxSum = Math.max(sum, maxSum);

                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,5};
        int[] nums1 = {4,4,4};
        System.out.println(maximumSubarraySum(nums, 3));
    }
}
