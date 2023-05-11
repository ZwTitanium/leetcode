package greedyalgorithm;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/10 10:48
 */
public class MaxArea {
    public static void main(String args[]) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while (i < j) {
            ans = height[i] < height[j] ? Math.max(ans, (j - i) * height[i++]) : Math.max(ans, (j - i) * height[j--]);
        }
        return ans;
    }
}
