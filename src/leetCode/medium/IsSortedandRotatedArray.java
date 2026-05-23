package leetCode.medium;

import java.util.ArrayList;
import java.util.Collections;

public class IsSortedandRotatedArray {
    public static boolean check(int[] nums) {
        if(nums.length == 1) return true;

        int i = 1;
        while(i < nums.length && nums[i-1] <= nums[i]) {
            i++;
        }

        ArrayList<Integer> a1 = new ArrayList<>();
        for(int j = 0; j < i; j++) {
            a1.add(nums[j]);
        }
        ArrayList<Integer> a1sort = new ArrayList<>(a1);
        Collections.sort(a1sort);

        ArrayList<Integer> a2 = new ArrayList<>();
        for(int j = i; j < nums.length; j++) {
            a2.add(nums[j]);
        }
        if(a2.isEmpty() && a1.equals(a1sort)) return true;

//the above part splits 2,1,3,4,5 in to 2 and 1,3,4,5 which are both sorted but i wanted 2,1 and 3,4,5
// so below logic won't work

        ArrayList<Integer> a2sort = new ArrayList<>(a2);
        Collections.sort(a2sort);

        if(a1.equals(a1sort) && a2.equals(a2sort) && Collections.max(a2) <= Collections.min(a1)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] ar = {6,10,6};
        System.out.println(check(ar));
    }
}
