package cm.itcast.demo01String;

import java.util.Arrays;

/**
 * @author kpwang
 * @create 2020-07-18 1:25
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        String str="abcabcddsbasaaabcd";
        System.out.println(str.length());//18
        //拼接字符串
        String str1="hello";
        String str2="World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//hello
        System.out.println(str2);//World
        System.out.println(str3);//helloWorld

        System.out.println(str.charAt(3));//a
        System.out.println(str.indexOf("cd"));//5
        System.out.println(str.lastIndexOf('c'));//16

        System.out.println(str.substring(0,4));//abca
        System.out.println(str.substring(6));//ddsbasaaabcd

        String[] as = str.split("a");
        System.out.println(Arrays.toString(as));//[, bc, bcddsb, s, , , bcd]

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));//[a, b, c, a, b, c, d, d, s, b, a, s, a, a, a, b, c, d]
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));//[97, 98, 99, 97, 98, 99, 100, 100, 115, 98, 97, 115, 97, 97, 97, 98, 99, 100]
        //String replace = str.replace('d', '+');
        String replace = str.replace("d", "+");
        System.out.println(replace);//abcabc++sbasaaabc+



    }
}
