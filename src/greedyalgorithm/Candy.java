package greedyalgorithm;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
      int[] ratings=new int[]{1,2,87,87,87,2,1};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings)
    {
        int[]candyNums=new int[ratings.length];
        int nums=0;
        Arrays.fill(candyNums, 1);
        for (int i = 0; i <ratings.length-1 ; i++) {
            if(ratings[i]<ratings[i+1])
                candyNums[i+1]=candyNums[i]+1;
        }
        for (int i = ratings.length-1; i>0 ; i--) {
            if(ratings[i-1]>ratings[i]&&candyNums[i-1]<=candyNums[i])
                candyNums[i-1]=candyNums[i]+1;
        }
        for (int i = 0; i <candyNums.length ; i++) {
            nums=nums+candyNums[i];
        }
        return nums;
    }
}