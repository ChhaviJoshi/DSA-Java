package leetCode.easy.array;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int lsum = 0, rsum = 0;

        for(int i = 0; i < nums.length; i++) {
            lsum += nums[i];
            leftSum[i] = lsum;
        }

        for(int i = nums.length-1; i >= 0; i--) {
            rsum += nums[i];
            rightSum[i] = rsum;
        }

        for(int i = 0; i < nums.length; i++) {
            if(leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
