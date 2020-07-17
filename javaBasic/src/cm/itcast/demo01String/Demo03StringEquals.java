package cm.itcast.demo01String;

/**
 * @author kpwang
 * @create 2020-07-18 1:15
 * 字符串equals方法比较的是内容，而Object的equals方法比较的是地址，和==一样的效果
 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4="hello";
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
    }
}
