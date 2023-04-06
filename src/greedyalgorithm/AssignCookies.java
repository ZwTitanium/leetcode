package greedyalgorithm;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/4/3 16:47
 */
public class AssignCookies {
    public static void main(String[] args) {
        int[]g=new int[]{1,2,3};
        int[]s=new int[]{3};
        System.out.println(findContentChildren(g,s));

    }
    public static int findContentChildren(int[] g, int[] s){
        int []children=Arrays.copyOf(g,g.length);
        Arrays.sort(children);
        int []cookies=Arrays.copyOf(s,s.length);
        Arrays.sort(cookies);
        int cookie=0;
        int child=0;
        while(child<children.length&&cookie<cookies.length)
        {if (children[child]<=cookies[cookie])
         child++;
        cookie++;}
        return child;
    }
}
