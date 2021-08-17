package OOP.demo2;

public class Student extends Person {

    public Student() {
        //隐藏代码: 调用了父类的构造器

        super();//调用父类构造器,必须在子类构造器的第一行
        System.out.println("Student无参构造执行");
    }

    private String name = "xiaoming";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();
        this.print();
//        super.print();
    }
}
