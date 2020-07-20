package cm.itcast.demo05Interface;

/**
 * @author kpwang
 * @create 2020-07-18 14:53
 * java 7,接口中可以包含
 *   1.常量
 *   2.抽象方法
 * java 8
 *   1.常量
 *   2.抽象方法
 *   3.默认方法
 *   4.静态方法
 * java 9
 *   1.常量
 *   2.抽象方法
 *   3.默认方法
 *   4.静态方法
 *   5.私有方法
 * 接口使用步骤
 *   1.接口不能直接使用，必须有一个“实现类”来实现接口
 *   2.接口的实现类必须覆盖重写(实现)接口中所有的抽象方法
 *   3.创建实现类对象，进行使用
 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstract impl=new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
        MyInterfaceAbstract d=new MyInterfaceAbstractClass() {
            @Override
            public void methodAbs() {
                super.methodAbs();
            }

            @Override
            public void methodAbs2() {
                super.methodAbs2();
            }

            @Override
            public void methodAbs3() {
                super.methodAbs3();
            }

            @Override
            public void methodAbs4() {
                super.methodAbs4();
            }
        };
        d.methodAbs();
    }
}
