package leetCode.medium.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Spliterator;

public class LonelyNumbersInArray {
    public static List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int n : nums) {
            if (!seen.add(n)) {
                duplicates.add(n);
            }
        }

        for (int n : seen) {
            if (!duplicates.contains(n)
                    && !seen.contains(n - 1)
                    && !seen.contains(n + 1)) {
                list.add(n);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,3};
        System.out.println(findLonely(nums));
    }
}
