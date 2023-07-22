package greedyalgorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/11 19:51
 */
public class ValidPalindrome {
    public static void main(String args[]) {
        String s = "abca";
        System.out.println(validPalindrome(s));

    }

    public static boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {

            char c1 = s.charAt(low);
            char c2 = s.charAt(high);
            if (c1 == c2) {
                low++;
                high--;
            } else
                return judgePalindrome(s,low+1,high)||judgePalindrome(s,low,high-1);
        }
        return true;
    }
    public static boolean judgePalindrome (String s,int low, int high){
        //判断回文数
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
