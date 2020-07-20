package cm.itcast.demo05Interface;

/**
 * @author kpwang
 * @create 2020-07-18 14:56
 * 在任何版本中java中，接口都可以定义抽象方法
 * 注意事项：
 *     1.接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
 *     2.这两个关键字修饰符，可以省略
 *     3.方法的三要素，可以随意定义
 * 从java8开始，接口里允许定义默认方法(为了解决接口升级问题)
 *
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodAbs();
    abstract void methodAbs2();
    public void methodAbs3();
    void methodAbs4();
    //以上四种都是一个意思


}
