package Thread;
//创建线程方式:继承Thread类,重写run()方法,调用start()方法开启线程
//总结: 线程不一定立即执行,有CPU调度

public class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        //run 方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码------"+i);
        }
    }

    public static void main(String[] args) {
        //main线程,主线程

        //创建一个线程对象,开启线程
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        //调用start()方法开启线程
        threadDemo1.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程------"+i);

        }
    }



}
