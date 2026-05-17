package leetCode.easy.string;

public class AdjacentAdd {
    public static boolean isAdjacentDiffAtMostTwo(String s) {
        boolean isTrue = true;

        for(int i = 0; i < s.length() - 1; i++) {
            int n = Character.getNumericValue(s.charAt(i));
            int m = Character.getNumericValue(s.charAt(i+1));

            if(Math.abs(m - n) > 2) isTrue = false;
        }
        return isTrue;
    }

    public static void main(String[] args) {
        System.out.println(isAdjacentDiffAtMostTwo("126"));
    }
}
