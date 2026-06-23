package leetCode.easy.array;

public class Altitude {
    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for(int n : gain) {
            altitude += n;
            maxAltitude = Math.max(altitude, maxAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {1, -4, 3, -2, 5};
        System.out.println(largestAltitude(gain));
    }
}
