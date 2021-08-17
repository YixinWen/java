package exception;

public class Demo {
    public static void main(String[] args) {
        //假设要捕获多个异常: 从小到大
        int a = 1;
        int b = 0;

        try {
            if (b == 0) {
                throw new ArithmeticException(); //主动抛出异常
            }
            System.out.println(a / b);


            //监控区域
            System.out.println(a / b);
        } catch (ArithmeticException e) { //捕获异常类型
            System.out.println("程序出现错误");
        } finally {//善后工作
            System.out.println("finally");
        }


    }
}


