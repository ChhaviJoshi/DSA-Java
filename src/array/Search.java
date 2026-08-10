package array;

public class Search {

    public static int linearSearch(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int a) {
        int start = 0;
        int end = arr.length;
        int mid = (start + end)/2;

        while (start < end) {
            if (arr[mid] == a)
                return mid;
            else if (arr[mid] < a) {
                start = mid + 1;
                mid = (start + end)/2;
            }
            else if (arr[mid] > a) {
                end = mid - 1;
                mid = (start + end)/2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr, 2));
        System.out.println(binarySearch(arr, 6));
    }
}
