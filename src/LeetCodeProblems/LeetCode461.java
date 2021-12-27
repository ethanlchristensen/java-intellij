package LeetCodeProblems;
import java.util.*;

public class LeetCode461 {
    static String intToBinary(int num) {
        String out = "";
        while( num > 0 ) {
            out += "" + num % 2;
            num = Math.floorDiv(num, 2);
        }
        return String.valueOf(new StringBuilder(out).reverse());
    }

    static String[] match(String x, String y) {
        String out[] = new String[2];
        if(x.length() >= y.length()) {
            y = String.valueOf(new StringBuilder(y).reverse());
            for( int i = 0; i < x.length() - y.length() + 1; i++) {
                y += '0';
            }
            y = String.valueOf(new StringBuilder(y).reverse());
        } else {
            x = String.valueOf(new StringBuilder(x).reverse());
            for( int i = 0; i < y.length() - x.length() + 1; i++) {
                x += '0';
            }
            x = String.valueOf(new StringBuilder(x).reverse());
        }
        out[0] = x;
        out[1] = y;

        return out;
    }

    static int hammingDistance(int x, int y) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int x = in.nextInt();
        System.out.print("Input the second integer: ");
        int y = in.nextInt();
        String bx = intToBinary(x);
        String by = intToBinary(y);
        System.out.println(bx + " " + by);
        String[] updated = match(bx, by);
        bx = updated[0];
        by = updated[1];
        System.out.println(bx + "\n" + by);
    }
}
