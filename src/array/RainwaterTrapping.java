package array;

public class RainwaterTrapping {

    public static int trappingRainwater (int[] barHeight) {
        // AUXILIARY ARRAYS TO STORE BOUNDARY BAR'S MAX HEIGHT
        int[] leftMax = new int[barHeight.length];
        leftMax[0] = barHeight[0];
        for (int i = 1; i < barHeight.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], barHeight[i]); //not leftMax[i] = Math.max(leftMax[i-1], leftMax[i]); (as leftmax[i] hasn't been set yet, so remember we're comparing last left max boundary to current bar height! not leftMax[i]
        }

        int[] rightMax = new int[barHeight.length];
        rightMax[barHeight.length - 1] = barHeight[barHeight.length - 1];
        for (int i = barHeight.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(barHeight[i], rightMax[i+1]);// not rightMax[i] = Math.max(barHeight[i-1], rightMax[i]);
        }

        //CALCULATING TRAPPED WATER
        int waterTrapped = 0;
        for (int i = 0; i < barHeight.length; i++) {
            waterTrapped += (Math.min(leftMax[i], rightMax[i]) - barHeight[i]);
        }
        return waterTrapped;
    }

    public static void main(String[] args) {
        int barHeight[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainwater(barHeight));
    }
}
