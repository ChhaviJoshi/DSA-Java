package leetCode.medium;

import java.util.Arrays;

public class LongestConsecutiveSubarray {
//    public static int longestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        int count = 1;
//        int i = 0;
//        while(i < nums.length - 1) {
//            if(nums[i]+1 == nums[i+1]){
//                count++;
//                i++;
//                if(nums[i]+1 != nums[i+1]) break;
//            }
//        }
//        return count;
//    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int count = 1;
        int max = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            } else if(nums[i] == 1+nums[i-1]){
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        max = Math.max(max, count);

        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {100,4,200,1,3,2};
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int[] nums3 = {1,0,1,2};

        System.out.println(longestConsecutive(nums1));
        System.out.println(longestConsecutive(nums2));
        System.out.println(longestConsecutive(nums3));
    }
}
