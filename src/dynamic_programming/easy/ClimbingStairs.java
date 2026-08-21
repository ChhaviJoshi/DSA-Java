package dynamic_programming.easy;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n <= 2) return n;

        int a = 1;
        int b = 2;
        int next = 0;

        for (int i = 3; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }
}
