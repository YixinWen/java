package OOP.demo4;

public class Person {
    public  void run(){
        System.out.println("run");
    }
}


/*
instanceof 类型判断

public static void main(String[] args) {
        //Object > Person > Student
        //Object > Person > Teacher
        //Object > String
        //三条继承线路


        //System.out.println(x instanceof y);
        Object Object = new Student();
        System.out.println(Object instanceof Student);//true
        System.out.println(Object instanceof Person);//true
        System.out.println(Object instanceof Object);//true
        System.out.println(Object instanceof Teacher);//fales
        System.out.println(Object instanceof String);//fales
        System.out.println("================================================");
        Person Person = new Student();
        System.out.println(Person instanceof Student);//true
        System.out.println(Person instanceof Person);//true
        System.out.println(Person instanceof Object);//true
        System.out.println(Person instanceof Teacher);//fales
//        System.out.println(Person instanceof String);//编译报错

        Student student = new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
//        System.out.println(student instanceof Teacher);//编译报错
//        System.out.println(student instanceof String);//编译报错


    }


//类型强转

    public static void main(String[] args) {
        //子类转换父类 可能丢失自己本来的方法
        //类型之间转换: 父 子
        //高    -->    强转           //低
        Person s1 = new Student();
        //将s1 转换成Student类 就能 使用Student方法
        // 父 调用 子 需要强转

        ((Student)s1).go();

//        Student s11= (Student) s1;
//        s11.go();


        1.父类引用指向子类的对象
        2.把子类转换为父类,向上转型
        3.把父类转换为子类,向下转型.强转
        4.方便方法的调用.减少重复代码


     */






