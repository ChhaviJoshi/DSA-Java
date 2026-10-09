package binarySearch;

//things which were wrong and were improved later are written between  !-! to bring them to notice so that i dont repeat them

public class CountNegativeInSortedMatrix {
    public static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;           //! arr,len - 1!
        int firstNegative =  arr.length;    // solves direct return statement issue
        while(start <= end) {               // <=
            int mid = (start + end) / 2;
            if(arr[mid] < 0) {
                end = mid - 1;
                firstNegative = mid;
            } else if(arr[mid] >= 0) {      //>=
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

    public static int countNegativesBruteForce(int [][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] < 0) count++;
            }
        }
        return count;
    }

    public static int countNegativesOptimal(int [][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;
        int right = n - 1;

        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = right;
            int firstNegative = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (grid[i][mid] < 0) {
                    firstNegative = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (firstNegative != -1) {
                count += n - firstNegative;
                right = firstNegative;
            }
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
