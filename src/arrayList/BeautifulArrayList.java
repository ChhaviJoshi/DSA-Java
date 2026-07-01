package arrayList;

import java.util.ArrayList;

public class BeautifulArrayList {
    public static ArrayList<Integer> beautifulArrayList(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i = 1; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for(int a : ans) {
                if(2 * a <= n) temp.add(2 * a);
            }

            for(int a : ans) {
                if(2 * a - 1 <= n) temp.add(2 * a - 1);
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(beautifulArrayList(4));
    }
}
