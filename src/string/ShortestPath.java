package string;

public class ShortestPath {
    //TIME COMPLEXITY O(n)

    public static void myshortestpath (String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'N'){
                y += 1;
            } else if (str.charAt(i) == 'S'){
                y -= 1;
            } else if(str.charAt(i) == 'E'){
                x += 1;
            } else if(str.charAt(i) == 'W'){
                x -= 1;
            }
        }
        System.out.println("Final coordinates are: " + "(" + x + "," + y + ")");
    }

    public static double shortestpath (String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        System.out.println(shortestpath("WNEENESENNN"));
        myshortestpath("WNEENESENNN");
    }
}
