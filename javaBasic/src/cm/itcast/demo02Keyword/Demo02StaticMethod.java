package cm.itcast.demo02Keyword;

/**
 * @author kpwang
 * @create 2020-07-18 3:19
 * 一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类
 * 如果没static关键字，那么必须首先创建对象，然后通过对象才能使用它
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.method();

        obj.methodStatic();//正确，不推荐
        MyClass.methodStatic();//推荐
    }

}
