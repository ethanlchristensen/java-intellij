package LeetCodeProblems;
import java.util.*;

public class LeetCode461 {

    static int hammingDistance(int x, int y) {
        int hd = 0;
        int res = x^y;
        while(res != 0) {
            int rsb = res &- res;
            res -= rsb;
            hd++;
        }
        return hd;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int x = in.nextInt();
        System.out.print("Input the second integer: ");
        int y = in.nextInt();
        int out = hammingDistance(x, y);
        System.out.println(out);
    }
}
