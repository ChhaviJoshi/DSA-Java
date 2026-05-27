package leetCode.medium;

public class SumPrimeRev {
    public static int revNum(int n) {
        int rev = 0;
        String m = String.valueOf(n);
        int len = m.length()-1;

        while(n > 0){
            rev += (n%10)*(int)(Math.pow(10,len));
            n /= 10;
            len--;
        }

        return rev;
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(revNum(10)));
    }
}
