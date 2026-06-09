package leetCode.easy.array;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAndDuplicateNumberInArray {

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(!set.contains(n)) {
                set.add(n);
            } else {
                ans[0] = n;
            }
        }

        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) ans[1] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
