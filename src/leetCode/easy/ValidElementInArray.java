package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class ValidElementInArray {
    public static boolean greaterRight(int[] nums, int j) {
        for(int i = j+1; i < nums.length; i++) {
            if(nums[i] > nums[j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean greaterLeft(int[] nums, int j) {
        for(int i = 0; i < j; i++) {
            if(nums[i] > nums[j]) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(greaterRight(nums, i) || greaterLeft(nums, i)){
                list.add(nums[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {

    }
}
