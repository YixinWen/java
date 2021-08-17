package OOP.demo2;


public class Person {
    public Person() {
        System.out.println("Person无参构造执行");
    }

    protected String name = "Yixin";
    //私有的无法被继承
    public void print(){
        System.out.println("Person");
    }

}

