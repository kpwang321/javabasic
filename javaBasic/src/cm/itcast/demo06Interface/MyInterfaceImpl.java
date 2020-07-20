package cm.itcast.demo06Interface;

/**
 * @author kpwang
 * @create 2020-07-18 22:59
 */
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {

    }


    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodDefault() {

    }
}
