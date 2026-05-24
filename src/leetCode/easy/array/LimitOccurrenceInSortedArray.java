package leetCode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;

public class LimitOccurrenceInSortedArray {
    /*HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            for(int distintEle : n) {
                map.put(distintEle, map.getOrDefault(distinctEle, 0) + 1);
            }
        }
    */

    public static int[] limitOccurrencesFlawed(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        while(i < nums.length - 1) {
            int count = 1;
            while(count <= k) {
                if(nums[i] == nums[i+1]) {
                    arr.add(nums[i]);
                    count++;
                    i++;
                } else {
                    i++;
                }
            }
        }

        int[] ans = new int[arr.size()];

        for(int j = 0; j < arr.size(); j++) {
            ans[j] = arr.get(j);
        }

        return ans;
    }


    //same logic but correct implementation
    public static int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        if(nums.length == 0) return new int[0];

        int count = 1;

        arr.add(nums[0]);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }

            if(count <= k) {
                arr.add(nums[i]);
            }
        }
        int[] ans = new int[arr.size()];

        for(int j = 0; j < arr.size(); j++) {
            ans[j] = arr.get(j);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(limitOccurrences(nums, 2)));
    }
}
