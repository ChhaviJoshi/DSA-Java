package leetCode.easy.array;

public class SumOfValidInRange {
    public static int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        for(int i = Math.max(1,(n-k)); i <= (n + k); i++) {
            if(Math.abs(n - i) <= k && (n & i) == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfGoodIntegers(2,3));
    }
}
