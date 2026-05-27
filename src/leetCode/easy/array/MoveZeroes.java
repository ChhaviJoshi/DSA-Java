package leetCode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {

    //AGAIN FOCUS ON THE RETURN TYPE AND THEN FORM SOLUTION!!!!!!
    public static int[] moveZeroeS(int[] nums) {
        int count = 0;

        for(int n : nums) {
            if(n == 0) count++;
        }

        int[] ans = new int[nums.length];


        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != 0) {
                list.add(nums[j]);
            } else {
                continue;
            }
        }

        for(int j = 0; j < nums.length - count; j++) {
            ans[j] = list.get(j);
        }

        return ans;
    }

    public static void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1; j++) {
                if(nums[j] == 0 && nums[j + 1] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,3,0,12};
        int[] result = moveZeroeS(nums);
        System.out.println(Arrays.toString(result));
    }
}
