package Common.inner;


import Common.inner.inner_Dome3.Outer;

public class OuterTest {
    public static void main(String[] args) {
//        //创建外部对象
//        Outer outer = new Outer();
//        //创建内部对象
//        Inner inner = outer.new Inner();
//
//        一步到位
//        Inner inner = new Outer().new Inner();

//        Outer.Inner inner = new Outer.Inner();
//
//        inner.show();


        Outer outer = new Outer();
        outer.show();


    }
}
