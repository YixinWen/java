package Thread;




/**
 * @Author YixinWen
 * @Date 6:01 2021/8/22
 **/

public class ThreadDemo3 implements Runnable {
    @Override
    public void run() {
        //run 方法线程体
        for (int i = 0; i < 10000000; i++) {
            System.out.println("我在看代码------" + i+Thread.currentThread().getName());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo3 t1 = new ThreadDemo3();

        Thread s1 = new Thread(t1);
        Thread s2 = new Thread(t1);
        s1.start();
        s2.start();




    }


}

