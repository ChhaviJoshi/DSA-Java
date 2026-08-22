package leetCode.easy;

public class DivisibleByDigSumPlusDigProducct {
    public static int digSum(int n) {
        int sum = 0;
        int num = n;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int digProduct(int n) {
        int product = 1;
        int num = n;
        while(num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }

    public static boolean checkDivisibility(int n) {
        if(n % (digSum(n) + digProduct(n)) == 0) return true;

        else return false;
    }

    public static boolean checkDivisibility2(int n) {
        int num = n;
        int sum = 0, product = 1;

        while(num > 0) {
            sum += num % 10;
            product *= num % 10;
            num /= 10;
        }

        if(n % (sum + product) == 0) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
        System.out.println(checkDivisibility2(99));
    }
}
