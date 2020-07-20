package cm.itcast.demo05Interface;

/**
 * @author kpwang
 * @create 2020-07-18 16:37
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }

    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
    private static void me(){
        System.out.println("staticaaa");
        System.out.println("staticbbb");
        System.out.println("staticccc");
    }

}
