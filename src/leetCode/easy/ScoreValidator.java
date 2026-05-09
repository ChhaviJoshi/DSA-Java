package leetCode.easy;

import java.util.Arrays;

public class ScoreValidator {
    public  static int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        for(String s : events) {
            if(s == "W") {
                counter++;
            } else if( s == "WD") {
                score++;
            } else if(s == "NB") {
                score++;
            } else {
                int st = Integer.parseInt(s);
                score += st;
            }
        }
        return new int[]{score, counter};
    }

    public static void main(String[] args) {
        String[] arr = {"1","4","W","6","WD"};
        System.out.println(Arrays.toString(scoreValidator(arr)));
    }
}
