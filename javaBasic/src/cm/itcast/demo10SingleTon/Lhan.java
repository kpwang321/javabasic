package cm.itcast.demo10SingleTon;

/**
 * @author kpwang
 * @create 2020-07-22 15:15
 * 懒汉式非线程安全
 */
public class Lhan {
    private static Lhan lhan;
    private Lhan(){}
    public static Lhan getInstance(){
        if (lhan==null){
            lhan=new Lhan();
        }
        return lhan;
    }
}
