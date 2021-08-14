package OOP.demo1;
/*
    1.提高程序的安全性,保护数据
    2.隐藏代码的实现细节
    3.同一接口
    4.系统可维护增加
 */


//类 private :私有
public class Student {
  //  属性私有
    private String name;//名字
    private int id; //学号
    private char sex;//性别
    private int age; //年龄

    //提供一些可以操作的属性方法
    //提供一些 public 的 get set 方法

    //get 获得这些数据
    public String getName(){
        return this.name;
    }

    //set 给这个数据设置值
    public void setName(){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }

    /*
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setAge(18);
        System.out.println(s1.getAge());
    }

     */

}
