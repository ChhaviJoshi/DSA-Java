package leetCode.medium;

public class MaxDistFromManhattan {
    public static int maxDistance(String moves) {
        int lCount = 0;
        int rCount = 0;
        int uCount = 0;
        int dCount = 0;
        int any = 0;

        for(int i = 0; i < moves.length(); i++) {
            switch(moves.charAt(i)) {
                case 'L' -> lCount++;
                case 'R' -> rCount++;
                case 'U' -> uCount++;
                case 'D' -> dCount++;
                case '_' -> any++;
            }
        }

        while(any > 0) {
            if(lCount == 0 && rCount > 0){
                rCount++;
                any--;
            } else if(rCount == 0 && lCount > 0){
                lCount++;
                any--;
            } else if(uCount == 0 && dCount > 0){
                dCount++;
                any--;
            } else if(dCount == 0 && uCount > 0){
                uCount++;
                any--;
            }
        }

        int ans = Math.abs(lCount - rCount) + Math.abs(uCount - dCount);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxDistance("LRUDD_"));
    }
}
