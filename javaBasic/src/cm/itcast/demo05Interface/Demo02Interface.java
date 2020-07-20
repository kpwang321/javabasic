package cm.itcast.demo05Interface;

/**
 * @author kpwang
 * @create 2020-07-18 16:23
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefault a=new MyInterfaceDefaultA();
        a.methodAbs();
        //调用默认方法，如果实现类里面没有该方法，会向上找接口
        a.methodDefault();
        a.methodDefault1();

        MyInterfaceDefault b=new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
        b.methodDefault1();

    }
}
