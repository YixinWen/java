package Common.inner.inner_Dome1;

/**
 *
 * 成员内部类
 *
 * 注意:
 * 在内部类定义与实例变量同级别类
 *
 *创建内部对象时,必须依赖外部类的对象
 * //        //创建外部对象
 * //        Outer outer = new Outer();
 * //        //创建内部对象
 * //        Inner inner = outer.new Inner();
 *
 * 内外属性重名 优先 内部类,访问外部类 Outer.this
 *
 * 内部类不能定义静态成员,可以包含静态常量final
 *
 *
 *
 *
 *
 *
 * @Author YixinWen
 * @Date 2021/9/27 15:28
 **/


public class Outer {
    //实例变量
    private String name ="张三";
    private int age = 20;

    //内部类
    class Inner {
        private String address = "北京";
        private String phone = "123";
        //内外属性重名 优先 内部
        private String name = "李四";
        //不能定义静态成员
//        private static String country = "中国";

        //可以包含静态常量final
        private static final String country = "中国";

        //方法
        public void show() {
            //打印外部类
            System.out.println(name);
            System.out.println(age);
              //访问外部  Outer.this
            System.out.println(Outer.this.name);
            //打印内部类
            System.out.println(address);
            System.out.println(phone);

        }
    }
}
