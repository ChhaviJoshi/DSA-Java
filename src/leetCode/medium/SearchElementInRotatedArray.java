package leetCode.medium;

import java.util.Arrays;

public class SearchElementInRotatedArray {

    //Arrays.asList() stores the whole array as a single object and not individual elements so it'd always return -1
    public static int searchWrong(int[] nums, int target) {
//        if(!Arrays.asList(nums).contains(target)) {
//            return -1;
//        } else {
            return Arrays.asList(nums).indexOf(target);
//        }
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] != target) {
            return -1;
        } else if(nums.length == 1 && nums[0] == target) {
            return 0;
        }

        int first = nums[0];
        int i = 1;
        while(i < nums.length && first <= nums[i]) {
            i++;
        }
        if(i < nums.length && target == nums[i]) {
            return i;
        } else if(target < first){
            int left = i;
            int right = nums.length;
            int mid = (left+right)/2;

            while(left < right) {
                if(nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid-1;
                    mid = (left+right)/2;
                } else {
                    left = mid+1;
                    mid = (left+right)/2;
                }
            }
        } else {
            int left = 0;
            int right = i-1;
            int mid = (left+right)/2;

            while(left <= right) {
                if(nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid-1;
                    mid = (left+right)/2;
                } else {
                    left = mid+1;
                    mid = (left+right)/2;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(search(nums, 0));
    }
}
