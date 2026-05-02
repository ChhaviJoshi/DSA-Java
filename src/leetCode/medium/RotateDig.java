package leetCode.medium;

public class RotateDig {

//    public static boolean isValid(int n){
//        if(n == 2 || n == 4 || n == 6 || n == 9) return true;
//        else return false;
//    }

//    public static int rotatedDigitsError(int n) {
//        int count = 0;
//
//        for(int i = 0; i <= n; i++) {
//            if(i < 10){
//                if(isValid(i)) count++;
//            } else {
//                int num = i;
//                while(num > 0) {
//                    if(isValid(num%10)) count++;
//                    num /= 10;
//                }
//            }
//        }
//        return count;
//    }

    public static int rotatedDigits(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++) {
            int num = i;
            boolean valid = true;
            boolean changed = false;

            while(num > 0) {
                int digit = num % 10;
                if(digit == 3 || digit == 4 || digit == 7) {
                    valid = false;
                    break;
                }
                if(digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                    changed = true;
                }
                num /= 10;
            }

            if(valid && changed) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(rotatedDigits(857));
    }
}
