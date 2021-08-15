package OOP.demo8;

public class Outer {

    private int id = 10;
    public void out(){
        System.out.println("这是外部类");
    }
    //内部类
    public class Inner{
        public void in(){
            System.out.println("这是内部类");
        }
    }
    //获得外部类的私有属性
    public void getID(){
        System.out.println(id);
    }
}
//一个java类中可以有多个class类,但只能有一个public class
class A{
    public static void main(String[] args) {

    }
}