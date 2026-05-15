package leetCode.easy;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        //s = s.stripTrailing();
        s = s.trim();
        int counter = 0;
        int i = s.length() - 1;
        while(s.charAt(i) != (' ') && i >= 0){
            counter++;
            i--;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello world "));
    }
}
