package cm.itcast.demo05Interface;

/**
 * @author kpwang
 * @create 2020-07-18 16:18
 */
public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法。BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("接口B覆盖重写了方法");
    }
}
