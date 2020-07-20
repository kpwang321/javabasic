package cm.itcast.demo05Interface;

/**
 * @author kpwang
 * @create 2020-07-18 16:16
 */
public interface MyInterfaceDefault {

    public abstract void methodAbs();

    //public abstract void methosAbs2();如果新添加一个方法，以前的实现类也需要改动

    //从java8开始接口允许定义默认方法
    //新添加的方法改成默认方法，可以解决以前的实现类不改动的问题
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
    default void methodDefault1(){
        System.out.println("这是新添加的默认方法1");
    }
    //以上两种是相同的意义，接口中的默认方法默认是public，也必须是public
}
