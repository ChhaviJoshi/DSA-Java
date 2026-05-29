package leetCode.easy.array;

import java.util.ArrayList;
import java.util.List;

public class MissingEleInArray {
    public static List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++) {
            list.add(i);
        }

        for(int n : nums) {
            if(list.contains(n)) list.remove(Integer.valueOf(n));
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,5};
        System.out.println(findMissingElements(nums));
    }
}
