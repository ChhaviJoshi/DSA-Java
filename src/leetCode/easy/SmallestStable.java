package leetCode.easy;

public class SmallestStable {
    public static int firstStableIndex(int[] nums, int k) {
        int[] prefixMax = new int[nums.length];
        int[] suffixMin = new int[nums.length];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }

            prefixMax[i] = max;
        }

        for(int i = nums.length-1; i >= 0; i--) {
            if(min > nums[i]) {
                min = nums[i];
            }

            suffixMin[i] = min;
        }

        int[] instabilityScore = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            instabilityScore[i] = prefixMax[i] - suffixMin[i];
        }

        for(int i = 0; i < instabilityScore.length; i++){
            if(instabilityScore[i] <= k){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,0,1,4};
        System.out.println(firstStableIndex(nums, 3));
    }
}
