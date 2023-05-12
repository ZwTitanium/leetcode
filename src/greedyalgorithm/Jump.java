package greedyalgorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/12 13:25
 */
public class Jump {
    public static void main(String args[]) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }

//    public static int jump(int[] nums) {
//        //用end指针控制结束索引避免了一次循环 大大提高了效率 这种技巧值得学习
//        int length = nums.length;
//        int end = 0;
//        int maxPosition = 0;
//        int steps = 0;
//        for (int i = 0; i < length - 1; i++) //只写一个循环
//        {
//            maxPosition = Math.max(maxPosition, i + nums[i]);
//            if (i == end) {
//                end = maxPosition;
//                steps++;
//            }
//        }
//        return steps;
//    }


//   太复杂！思想是一样的 但是代码太复杂
    public static int jump(int[] nums) {
        int i = 0;
        int count = 0;
        while (i < nums.length) {
            if (i + nums[i] == nums.length - 1) {
                count++;
                return count;
            }
            i = judgeMax(nums, i, nums[i]);
            count++;
        }
        count++;
        return count;
    }

    public static int judgeMax(int[] nums, int i, int j) {
        int maxIndex = i + 1;
        if(j==1)
            return maxIndex;
        for (int k = i + 2; k < i + j; k++) {
            if (nums[k] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
