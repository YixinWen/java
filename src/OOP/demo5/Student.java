package OOP.demo5;

//static
public class Student {
    private static  int age; //静态变量
    private  double score; //非静态变量

    public void run(){
        System.out.println("run");

    }
    public static void go(){
        System.out.println("go");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);
//        System.out.println(Student.score); //错误

        System.out.println(s1.score);
        System.out.println(s1.age);
        Student.go();


    }




}
