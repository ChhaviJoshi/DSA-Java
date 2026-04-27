package leetCode.easy;

public class ValidInt {
    public static boolean validDigit(int n, int x) {
        String s = Integer.toString(n);
        if(s.charAt(0) == x) {
            return false;
        }
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validDigit(5, 1));
    }
}
