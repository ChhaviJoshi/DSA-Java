package slidingWindow.dynamicsize;

public class DynamicSize {
    public static int smallestSubarrayWithTargetSum(int[] nums, int target) {
        int sum = 0, i = 0, j = 0, minSize = Integer.MAX_VALUE;

       while(j < nums.length) {
           sum += nums[j];

           while(sum >= target) {
               sum -= nums[i];
               minSize = Math.min(minSize, j-i+1);
               i++;
           }
           j++;
       }
       return minSize;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(smallestSubarrayWithTargetSum(nums, 7));
    }
}
