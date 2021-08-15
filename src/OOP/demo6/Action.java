package OOP.demo6;
/**
 * @author YixinWen
 */

//抽象类的所有方法都必须继承它的子类,都必须要实现它的方法
//abstract 抽象类 extends 单继承  (接口可以多继承)
public  abstract class Action {
    //abstract ,抽象方法,只有方法名字,没有方法的实现
    public abstract void doSomething();
}
//1.不能new这个抽象类,只能靠子类实现它
//2.抽象类中可以普通方法
//3.抽象方法必须在抽象类中