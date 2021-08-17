package exception;

public class Demo3 {
    public static void main(String[] args) {

        try {
            new Demo3().test(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }


    public void test(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException(); //主动抛出异常,一般在方法中使用
        }

    }


}

