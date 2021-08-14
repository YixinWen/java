package OOP.demo3;

public class Person {
    public  void run(){
        System.out.println("run");
    }

}


/*
多态注意事项
    1.多态是方法,属性没有多态
    2.父类和子类有联系 联系转换异常 ClassCastException !
    3.存在的条件: 继承关系 方法要重写 父类的引用指向子类 Father f1 = new son ();
 */

/*
public static void main(String[] args) {
        //对象的实际类型是确定的
        //new Student Person
        //可以指向的引用类型不确定 : 父类的引用指向子类


        // Student子类型: 能调用的方法是自己的和继承父类的
        Student s1 = new Student();
        //Person 父类型: 可以指向子类,但不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

//        s2.eat(); //不行 子类独有方法
        //子类重写了父类的方法
        s2.run();
        //对象能执行的方法: 主要看左边的类型,和右边关系不大
        s1.eat();


    }

 */