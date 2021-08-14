package OOP;


import OOP.demo3.Student;
import OOP.demo3.Person;

class Application {
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
}
