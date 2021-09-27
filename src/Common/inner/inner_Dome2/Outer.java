package Common.inner.inner_Dome2;
/**
 *
 * 静态内部类
 *
 * 不依赖外部类对象,可以直接创建或通过类名访问,可声明静态成员
 *
 *能直接访问外部类的静态成员
 * Outer.Inner inner = new Outer.Inner();
 *
 *
 * @Author YixinWen
 * @Date 2021/9/27 16:57
 **/

//外部类
public class Outer {

    private String name = "xxx";
    private int age = 19;


    //静态内部类: 和外部类相同
    public static class Inner{
        private String address = "上海";
        private String phone = "999";

        //静态成员
        private static int count = 1000;

        public void show(){
            //打印外部类
            //创建外部对象
            Outer outer = new Outer();

            System.out.println(outer.name);
            System.out.println(outer.age);
            //打印静态内部
            System.out.println(address);
            System.out.println(phone);

            //访问静态内部类的静态属性
            System.out.println(Inner.count);
        }



    }


}
