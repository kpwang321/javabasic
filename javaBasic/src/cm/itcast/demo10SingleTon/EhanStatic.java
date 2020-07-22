package cm.itcast.demo10SingleTon;

/**
 * @author kpwang
 * @create 2020-07-22 15:09
 */
public class EhanStatic {
    private static EhanStatic ehanStatic;
    static {
        ehanStatic=new EhanStatic();
    }
    private EhanStatic(){

    }
    public static EhanStatic getInstance(){
        return ehanStatic;
    }
}
