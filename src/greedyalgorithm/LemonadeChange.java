package greedyalgorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/12 12:54
 */
public class LemonadeChange {
    public static void main(String args[]) {
        int[] bills = new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
//        int[] count = new int[3];
//        for (int i = 0; i < bills.length; i++) {
//            if (bills[i] == 5)
//                count[0]++;
//            else if (bills[i] == 10) {
//                count[1]++;
//                count[0]--;
//                if (count[0] < 0)
//                    return false;
//            } else if (bills[i] == 20) {
//            count[2]++;
//            count[1]--;
//            count[0]--;
//            if(count[1]<0||count[0]<0)
//                return false;
//            }
//        }
//        return true;
        //官方答案没有设置数组，只有five和ten
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
