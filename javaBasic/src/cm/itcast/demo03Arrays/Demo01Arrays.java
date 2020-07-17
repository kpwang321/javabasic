package cm.itcast.demo03Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-18 3:38
 * 一个于数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray={10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);//[10, 20, 30]
        int[] array1={1,3,10,6,2};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//[1, 2, 3, 6, 10]

        String[] arrayStr={"aa","bb","cc"};
        List<String> list = Arrays.asList(arrayStr);//数组转集合


        System.out.println(list);
    }
}
