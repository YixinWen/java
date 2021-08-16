package exception;

public class Demo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("程序出现错误");
        }finally {

        }


    }
}
