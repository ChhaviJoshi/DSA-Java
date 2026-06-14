package leetCode.easy;

public class GoodInteger {
    public static boolean checkGoodInteger(int n) {
        int dig = n;
        int digSum = 0;
        int sqSum = 0;
        while(dig != 0) {
            digSum += (dig % 10);
            sqSum += (dig % 10) * (dig % 10);
            dig /= 10;
        }

        boolean good = (sqSum - digSum >= 50) ? true : false;
        return good;
    }

    public static void main(String[] args) {
        System.out.println(checkGoodInteger(1000));
    }
}
