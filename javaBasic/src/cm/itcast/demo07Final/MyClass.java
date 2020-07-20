package cm.itcast.demo07Final;

/**
 * @author kpwang
 * @create 2020-07-19 0:57
 * final关键字修饰一个类的时候，当前类不能有子类，其他用法和普通类一样
 * final关键字修饰一个方法的时候，当前方法不能被重写
 */
public  final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
