package OOP.demo1;
/**
 * @author YixinWen
 */
//java-->class
public class Person {
    //一个类即使什么都不写,它也会存在一个方法
    //构造器

    String name;
    int age;
    //1.使用new关键字,实际在调用构造器
    //2.用来初始化值
    public Person() {
    }

    //有参构造:一旦有了有参构造,无参必须显示定义
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*
public static void main(String[] args) {

        //new 实例化一个对象
        Person person = new Person("Yixin",20);
        System.out.println(person.name);

    }

    构造器:
        1.和类名相同
        2.没有返回值
    作用:
        1.new 本质在调用构造方法
        2.初识话对象值
    注意点:
        1.有参构造:一旦有了有参构造,无参必须显示定义
 */
