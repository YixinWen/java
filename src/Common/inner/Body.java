package Common.inner;
/**
 *
 * 主题:
 *内部类
 *
 * 概念:
 * 在内部类中在定义一个内部类
 * 特点:
 * 可以生产独立字节码
 * 内部类可以直接访问外部类的私有成员
 * 可以为外部提供必要的功能组件
 *
 *
 *
 *
 * @Author YixinWen
 * @Date 2021/9/27 14:55
 **/



public class Body  {
    private String name;
    //内部类
    class Header{
       public void show(){
           System.out.println(name);
       }
    }
}


