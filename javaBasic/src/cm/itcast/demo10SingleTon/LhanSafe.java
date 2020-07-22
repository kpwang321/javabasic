package cm.itcast.demo10SingleTon;

/**
 * @author kpwang
 * @create 2020-07-22 15:18
 * 懒汉线程安全
 */
public class LhanSafe {
    private static LhanSafe lhanSafe;
    private LhanSafe(){}
    public static synchronized LhanSafe getInstance(){
        if (lhanSafe==null){
            lhanSafe=new LhanSafe();
        }
        return lhanSafe;
    }
}
