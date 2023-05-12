package greedyalgorithm;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/11 15:14
 */
public class ArrayPairsum {
    public static void main(String args[]){
        int [] nums=new int []{6,2,6,5,1,2};
        System.out.println(arrayPairsum(nums));
    }

    public static int arrayPairsum(int []nums){
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i <nums.length ; i+=2) {
            sum+=nums[i];
        }
        return sum;
    }
}
