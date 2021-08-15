package OOP.demo8;


class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过这个外部来实现内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();//这是内部类

    }
}
