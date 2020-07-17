package cm.itcast.demo01String;

/**
 * @author kpwang
 * @create 2020-07-17 22:29
 * 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中
 * 对于基本数据类型来说，==是进行数值的比较
 * 对于引用类型来说，==是进行地址值的比较
 */
public class Demo02StringPool extends Object{
    public static void main(String[] args) {
        int a=10;
        byte b=10;
        int c=97;
        char d='a';
        String str1="abc";
        String str2="abc";
        char[] charAray={'a','b','c'};
        String str3=new String(charAray);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str3));
        System.out.println(a==b);
        System.out.println(c==d);
    }
}
