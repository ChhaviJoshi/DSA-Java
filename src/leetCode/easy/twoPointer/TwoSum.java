package leetCode.easy.twoPointer;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            if(numbers[left] + numbers[right] < target) {
                left++;
            } else if(numbers[left] + numbers[right] > target) {
                right--;
            } else {
                break;
            }
        }
        return new int[] {left+1, right+1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,12,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
