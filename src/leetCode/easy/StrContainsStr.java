package leetCode.easy;

public class StrContainsStr {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i = 0; i < n-m; i++) {
            int j = 0;
            while(j < m && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            }

            if(j == m) {
                return i;
            }
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("asadbad", "sad"));
        System.out.println(strStr1("asadbad", "sad"));
    }
}
