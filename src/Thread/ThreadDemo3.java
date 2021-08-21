package Thread;




/**
 * @Author YixinWen
 * @Date 6:01 2021/8/22
 **/
/**
 * @Author MixinWen
 * @Date 6:02 2021/8/22
 **/
public class ThreadDemo3 implements Runnable {
    @Override
    public void run() {
        //run 方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码------" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo3 t1 = new ThreadDemo3();

        new Thread(t1).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("我在学习多线程------" + i);

        }
    }


}

