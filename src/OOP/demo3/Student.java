package OOP.demo3;

public class Student extends Person {
    //重写 父类 方法
    @Override
    public void run() {
        System.out.println("son");
    }
    // 子类 独有方法
    public void eat(){
        System.out.println("eat");
    }
}
