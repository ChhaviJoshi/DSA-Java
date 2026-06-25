package leetCode.medium;

public class MajorityInSubarray {
    public static int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                int count  = 0;
                int size = 0;
                for(int a = i; a <= j; a++) {
                    size++;
                    if(nums[j] == target) count++;
                }
                if(count > size / 2) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(countMajoritySubarrays(nums, 2));
    }
}
