package leetCode.easy.array;

public class MinEleAfterReplacementWithSum {
    public static int digSum(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int minElement(int[] nums) {
        int[] sum = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum[i] = digSum(nums[i]);
            min = Math.min(sum[i], min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {10,12,15,28,-52,-8};
        System.out.println(minElement(nums));
    }
}
