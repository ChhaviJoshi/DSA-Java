package leetCode.medium;

public class BitonicArray {
    public static int compareBitonicSums(int[] nums) {
        int peak = Integer.MIN_VALUE;
        int ascSum = 0;
        int dscSum = 0;

        for(int n : nums) {
            if(peak < n) {
                peak = n;
            }
        }

        int peakIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == peak) {
                peakIndex = i;
            }
        }

        for(int i = 0; i <= peakIndex; i++) {
            ascSum += nums[i];
        }

        for(int i = peakIndex; i < nums.length; i++) {
            dscSum += nums[i];
        }

        if(ascSum < dscSum) {
            return 1;
        } else if(ascSum > dscSum) {
            return 0;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] nums2 = {2,4,5,2};
        int[] nums3 = {1,2,4,3};
        System.out.println(compareBitonicSums(nums3));
    }
}
