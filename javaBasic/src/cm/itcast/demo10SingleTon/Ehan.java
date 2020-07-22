package cm.itcast.demo10SingleTon;

/**
 * @author kpwang
 * @create 2020-07-21 22:15
 * 饿汉式
 */
public class Ehan {
    private static Ehan ourInstance = new Ehan();
    private Ehan() {
    }

    public static Ehan getInstance() {
        return ourInstance;
    }


}
