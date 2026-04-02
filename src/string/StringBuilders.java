package string;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        //O(26)
        //with string O(n^2)
        System.out.println(sb);
        System.out.println(sb.length());
        //all string methods can be applied on StringBuilder as well
    }
}
