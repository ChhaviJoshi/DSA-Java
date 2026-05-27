package leetCode.easy.array;

public class MirrorDistanceOfNum {

    //SOLUTION USING 3 METHODS, BRUTE FORCE, FIRST APPROACH, BUT IS BETTER!!!!
    //LESS TIME AND SPACE COMPLEXITY
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int lastDig = n%10;
            rev = rev*10+lastDig;
            n /=10;
        }
        return rev;
    }

    public static int abs(int m, int n){
        int subtraction;
        if(m>n){
            subtraction = m-n;
        }
        else{
            subtraction = n-m;
        }
        return subtraction;
    }

    public static int mirrorDistanceBrute(int n) {
        int revnum = reverse(n);
        return abs(n,revnum);
    }

    //SUMMING UP ALL METHODS INTO ONE
    public static int mirrorDistance(int n) {
        int num = n;
        int reverse=0;
        while(num>0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }
        return Math.abs(n-reverse);
    }

    //OTHER APPROACH , WORST
    public static int mirrorDistanceString(int n) {
        String s = String.valueOf(n);
        StringBuilder rev = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }

        int revnum = Integer.parseInt(String.valueOf(rev));

        return Math.abs(n - revnum);
    }

    public static void main(String[] args) {
        System.out.println(mirrorDistance(25));
    }
}
