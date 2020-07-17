package cm.itcast.demo02Keyword;

/**
 * @author kpwang
 * @create 2020-07-18 3:06
 * 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student.room="101教室";
        Student two=new Student("黄蓉",16);

        System.out.println(two.getName()+two.getAge()+"教室"+Student.room+"id:"+two.getId());
        Student one=new Student("郭靖",19);

        System.out.println(one.getName()+one.getAge()+"教室"+Student.room+"id:"+one.getId());


    }
}
