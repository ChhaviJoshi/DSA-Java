package leetCode.medium;

public class MajorityInSubarray {

    //TLE FOR LARGE ARRAY INPUT
    public static int countMajoritySubarrays3loops(int[] nums, int target) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                int count  = 0;
                int size = 0;
                for(int a = i; a <= j; a++) {
                    size++;
                    if(nums[a] == target) count++;
                }
                if(count > size / 2) ans++;
            }
        }
        return ans;
    }

    public static int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int count  = 0;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] == target) count++;
                int size = j - i + 1;
                if(count > size / 2) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,10};
        System.out.println(countMajoritySubarrays(nums, 10));
    }
}
