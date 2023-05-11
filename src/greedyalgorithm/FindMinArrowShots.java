package greedyalgorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/4/6 20:21
 */
public class FindMinArrowShots {
    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

    private static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1] );
            }
        });
        int right = points[0][1];
        int arrows=1;
        for (int point=1; point <points.length ; point++) {
            if(points[point][0]>right) {
                ++arrows;
                right = points[point][1];

            }
        }
        return arrows;
    }
}

