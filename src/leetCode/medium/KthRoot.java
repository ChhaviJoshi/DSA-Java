package leetCode.medium;

public class KthRoot {

    //NOT OPTIMAL!!
    public static boolean perfectRootsOfPowerk(int n, int k) {
        if (k == 1) return true;

        for (int i = 1; i * i <= n; i++) {
            int prod = 1;
            int pow = k;
            while (pow != 0) {
                prod *= i;
                pow--;
            }

            if (prod == n) {
                return true;
            }
        }
        return false;
    }

    public static int countKthRoots(int l, int r, int k) {
        int count = 0;

        if (l == 0) count++;
        for (int i = l; i <= r; i++) {
            if (perfectRootsOfPowerk(i, k)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countKthRoots(8,30,2));
    }
}
