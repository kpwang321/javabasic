package cm.itcast.demo09Abstract;

/**
 * @author kpwang
 * @create 2020-07-21 20:52
 */
public abstract class Person {
    private String name;
    private Integer age;
    private static final String ABC="s";
    static final String ABC1="s";
    protected static final String ABC2="s";
    public static final String ABC3="s";



    abstract void sleep();
    protected abstract void eat();
    public abstract void sport();

    private void play(){
        System.out.println("play");
    }
    public void play(String s){
        System.out.println("play");
    }

}
