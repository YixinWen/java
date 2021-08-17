package exception;

public class test {
    static void test(int a) throws MyException {
        System.out.println("传递的数值:" + a);
        if (a > 10) {
            throw new MyException(a);//抛出
        }

        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(50);
        } catch (MyException e) {
            System.out.println("MyException==>" + e);
        }

    }


}
