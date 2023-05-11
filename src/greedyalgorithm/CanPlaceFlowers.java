package greedyalgorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/4/6 13:48
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = new int[]{0, 1, 0, 0, 0, 0};
        System.out.println(judge(flowerbed, 3));
    }

    private static boolean judge(int[] flowerbed, int n) {
        //数连续0的个数
        int countZero = 1;//数组最前面有一个虚假的0
        int canPlace = 0;//计数可以种花的位置
        for (int bed : flowerbed) {//遍历数组
            if (bed == 0) {
                countZero++;//如果当前数组为0则加1
            } else {//如果是1则停止开始计算可以种花的位置
                canPlace += (countZero - 1) / 2;
                //1、2个0不可以种花 3、4可以种一朵 易总结出规律
                if (canPlace >= n) return true;//提前判断一次满足就不用继续遍历
                countZero = 0;//重置0计数器
            }
        }
        //循环条件是遍历完整个数组
        canPlace += countZero / 2;
        return canPlace >= n;


    }
}
