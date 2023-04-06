package greedyalgorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/4/3 18:39
 */
public class NonoverlappingInrervals {
    public static void main(String[] args) {
        int [][] intervals=new int[][]{{1,2},{2,3},{1,3},{3,4}};

        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals){
        if(intervals.length==0)
            return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int n=intervals.length;
        int right=intervals[0][1];
        int nums=1;
        for (int i = 0; i < intervals.length-1; i++) {
            if (right<=intervals[i+1][0]){
                nums++;
                right=intervals[i+1][1];
            }
        }
        return n-nums;
    }
}
