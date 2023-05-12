package greedyalgorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/12 15:51
 */
public class CanJump {
    public static void main(String args[]) {
        int[] nums = new int[]{2,0,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length!=1&&nums[0]==0)
            return false;
        if (nums[0]==0&&nums.length==1)
            return true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                if (!judgeCanJump(nums, i))
                    return false;
        }
        return true;
    }

    public static boolean judgeCanJump(int[] ints, int i) {
        int maxIndex = 0;
        for (int j = 0; j < i; j++) {
            if (ints[i] > ints[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int j = i - 1; j >= maxIndex && j < i; j--) {
            if (j + ints[j] >= i + 1)
                return true;
        }
        return false;
    }
}
