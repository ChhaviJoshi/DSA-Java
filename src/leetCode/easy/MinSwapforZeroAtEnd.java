package leetCode.easy;

public class MinSwapforZeroAtEnd {
    public static int minimumSwapsWrong(int[] nums) {
        int swap = 0;
        int swapIndex = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && i != swapIndex - swap){
                swap++;
            }
        }

        return swap;
    }

    public static int minimumSwaps(int[] nums) {
        int zeroCount = 0;

        for(int n : nums) {
            if(n == 0) zeroCount++;
        }

        int wrongZero = 0;
        for(int i = 0; i < nums.length - zeroCount; i++) {
            if(nums[i] == 0) wrongZero++;
        }
        return wrongZero;
    }

    public static void main(String[] args) {
        int[] arr = {0,0};
        int[] arr1 = {0,1,0};
        System.out.println(minimumSwaps(arr));
    }
}
