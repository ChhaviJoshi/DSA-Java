package array.sheet;

public class Q1 {

    public static boolean hasDuplicate(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 1};
        int [] nums1 = {1, 2, 3, 4, 5};
        int [] nums2 = {1, 2, 3, 2, 5};

        System.out.println(hasDuplicate(nums));
        System.out.println(hasDuplicate(nums1));
        System.out.println(hasDuplicate(nums2));
    }
}
