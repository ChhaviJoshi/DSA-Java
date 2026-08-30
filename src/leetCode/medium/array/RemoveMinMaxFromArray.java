package leetCode.medium.array;

import java.util.Arrays;

public class RemoveMinMaxFromArray {
    public static int binarySearch(int[] nums, int n) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] < n) {
                start = mid + 1;
            } else if(nums[mid] > n) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int search(int[]nums, int n) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == n) return i;
        }
        return -1;
    }

    public static int minimumDeletions(int[] nums) {
        if(nums.length == 1) return 1;
        int[] sorted = nums.clone();

        int ans = 0;
        Arrays.sort(sorted);
        int min = sorted[0];
        int max = sorted[nums.length - 1];
        int minPosition = search(nums, min);
        int maxPosition = search(nums, max);

        int minsDistFromBack = nums.length - minPosition;
        int maxsDistFromBack = nums.length - maxPosition;

        int minimunDistOfMin = Math.min(minPosition + 1, minsDistFromBack);
        int minimunDistOfMax = Math.min(maxPosition + 1, maxsDistFromBack);

        if(minimunDistOfMax <= minimunDistOfMin) {
            minimunDistOfMin = Math.min(minimunDistOfMin, Math.abs(maxPosition - minPosition));
            ans = minimunDistOfMax + minimunDistOfMin;
        } else if(minimunDistOfMin < minimunDistOfMax) {
            minimunDistOfMax = Math.min(minimunDistOfMax, Math.abs(maxPosition - minPosition));
            ans = minimunDistOfMax + minimunDistOfMin;
        } else {
            ans = minimunDistOfMax + minimunDistOfMin;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 10, 7, 5, 4, 1, 8, 6};
        int[] nums2 = {0,-4,19,1,8,-2,-3,5};
        int[] nums3 = {-500,-100000,100000,500};
        System.out.println(minimumDeletions(nums3));
    }
}
