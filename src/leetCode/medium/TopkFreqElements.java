package leetCode.medium;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopkFreqElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List<Integer> kFrequent = map.entrySet().stream()
                .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return kFrequent.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,1,3,2,1,2,2};
        topKFrequent(nums, 2);
    }
}
