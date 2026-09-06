package string;

public class RotationCountEqualToK {
    public static int countRotationEqualk (String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int ans = 0;

        do {
            int score = 0;
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);

            for(int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == sb.charAt(i + 1)) score++;

                if(score == k) ans++;
            }
        } while (!sb.toString().equals(s));

        return ans;
    }

    //correct
    //do while was having issue with no. of iterations
    public static int countRotationEqualTok(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int ans = 0;
        int size = s.length();

        for(int rotation = 0; rotation < size; rotation++) {
            int score = 0;
            for(int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == sb.charAt(i + 1)) score++;
            }
            if(score == k) ans++;

            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countRotationEqualTok("aab" , 1));
        System.out.println(countRotationEqualTok("abca" , 0));
    }
}
