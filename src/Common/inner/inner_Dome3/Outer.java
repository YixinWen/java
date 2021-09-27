package Common.inner.inner_Dome3;
/**
 *
 * 局部内部类
 *
 *
 * 定义在外部方法中,作用范围和创建对象仅限于当前方法
 * 局部内部类访问外部类当前方法时,无法保障变量周期,必须实现final
 * 限制类的使用范围
 *
 *
 *
 *
 *
 *
 *
 * @Author YixinWen
 * @Date 2021/9/27 17:38
 **/


//外部类
public class Outer {
    private String name = "lX";
    private int age = 30;

    public void show(){
        //定义局部变量
       String address = "深圳";

        //局部内部类 不能加任何访问修饰符
        class Inner{

            private String phone = "51555646";
            private String email = "113@qq.com";

            public void show2(){
                //访问外部类
                System.out.println(name);
                System.out.println(age);
                //访问内部类
                System.out.println(phone);
                System.out.println(email);
                //访问局部变量  jdk1.7 变量必须是常量final jdk1.8 自动添加
                System.out.println(address);

        }

        }
        Inner inner = new Inner();
        inner.show2();

    }

}
