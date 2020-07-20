package cm.itcast.demo05Interface;

/**
 * @author kpwang
 * @create 2020-07-18 16:29
 */
public interface MyInterfaceStatic {
    public static final int NUM=10;//常量
    int NUM1=10;
    //以上两种是一样的意义，在接口中可以省略修饰


    //接口中定义静态方法
    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
}
