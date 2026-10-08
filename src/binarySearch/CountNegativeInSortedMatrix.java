package binarySearch;

public class CountNegativeInSortedMatrix {
    public static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int firstNegative =  arr.length;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] < 0) {
                end = mid - 1;
                firstNegative = mid;
            } else if(arr[mid] >= 0) {
                start = mid + 1;
            }
        }
        return arr.length - firstNegative;
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            count += binarySearch(grid[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};

        int[][] grid2 = {{3,2},
                {1,0}
        };

        System.out.println(countNegatives(grid));
        System.out.println(countNegatives(grid2));
    }
}
