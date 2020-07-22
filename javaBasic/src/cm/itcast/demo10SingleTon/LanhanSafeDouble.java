package cm.itcast.demo10SingleTon;

/**
 * @author kpwang
 * @create 2020-07-22 15:20
 */
public class LanhanSafeDouble {
    private static volatile LanhanSafeDouble lanhanSafeDouble;//不加volatile可能会因为指令重排出现可见性问题
    private LanhanSafeDouble(){}
    public static LanhanSafeDouble getInstance(){
        if (lanhanSafeDouble==null){
            synchronized (LanhanSafeDouble.class){
                if (lanhanSafeDouble==null){
                    lanhanSafeDouble=new LanhanSafeDouble();
                }
            }
        }
        return lanhanSafeDouble;
    }
}
