package array.sheet;

public class Q2 {

    public static int rotatePivotIndex(int [] nums, int pivot, int target) {
        int count = nums.length - pivot;

        int [] arr = new int[nums.length];
        int j = pivot;
        for (int i = 0; i < count; i++) {
            arr[i] = nums[j];
            j++;
        }

        arr[count] = nums[0];
        int l = 1;
        for (int i = count + 1; i < nums.length; i++) {
            arr[i] = nums[l];
            l++;
        }

//        for(int i : arr) {
//            System.out.print(i + " ");
//        }

        //SEARCHING AFTER ROTATION
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        System.out.println(rotatePivotIndex(nums, 2, 4));
    }
}
