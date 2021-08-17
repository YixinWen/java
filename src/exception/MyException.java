package exception;

//自定义的异常类
public class MyException extends Exception {
    //传递数字>10
    private int delail;

    public MyException(int a) {
        this.delail = a;
    }
    //toString

    //异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "delail=" + delail +
                '}';
    }

}
