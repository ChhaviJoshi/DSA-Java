package leetCode.easy;

public class MiddleElementUnique {
    public static boolean isMiddleElementUnique(int[] nums) {
        int middle = nums[nums.length / 2];

        for(int i = 0; i < nums.length; i++) {
            if(i == nums.length / 2) {
                continue;
            } else if( nums[i] == middle) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(isMiddleElementUnique(nums));
    }
}
