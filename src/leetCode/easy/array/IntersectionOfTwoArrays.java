package leetCode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int n : nums1) {
            set1.add(n);
        }

        for(int n : nums2) {
            set2.add(n);
        }

        for(int n : set1) {
            if(set2.contains(n)) {
                list.add(n);
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,1,2};
        int[] nums2 = {2,1,2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
