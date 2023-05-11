package greedyalgorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/10 11:12
 */
public class CheckPossibility {
    public static void main(String args[]) {
        int[] nums = new int[]{5, 7, 1, 8};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i <nums.length-1; i++) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return count <= 1;
    }
}
