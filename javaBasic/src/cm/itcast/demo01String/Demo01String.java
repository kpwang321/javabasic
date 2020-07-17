package cm.itcast.demo01String;

import java.sql.SQLOutput;

/**
 * @author kpwang
 * @create 2020-07-17 22:12
 * 字符串的特点
 * 1.字符串的内容永不可变
 * 2.正因为字符串不可改变，所有字符串时可以共享使用
 * 3.字符串效果上相当于时char[]字符数组，但是底层原理时byte[]字节数组
 *
 * 创建字符串的常见3+1种方式
 * 三种构造方法：
 *    public String();创建一个空白字符串，不含有任何内容
 *    public String(char[] array);根据字符数组的内容，来创建对应的字符串
 *    public String(byte[] array);根据字节数组的内容，来创建对应的字符串
 * 一种直接创建
 *    String str4="hello";
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();
        System.out.println(str1);
        //根据字符数组创建字符串
        char[] charArray={'A','B','c'};
        String str2=new String(charArray);
        System.out.println(str2);
        //根据字节数组创建字符串
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println(str3);

        String str4="hello";
        System.out.println(str4);
    }


}
