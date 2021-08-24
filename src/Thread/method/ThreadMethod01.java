package Thread.method;
/**
 * @Author YixinWen
 * @Date 2021/8/24 14:47
 * 线程常用方法
 **/

/*
setName 设置线程名
getName 获取线程名
start 执行线程
run 调用run方法
setPriority 设置线程优先级
getPriority 获取线程优先级
sleep 线程休眠
interrupt 中断线程

 */

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("Yixin");
        t.setPriority(Thread.MIN_PRIORITY);//优先级最低
        t.start();
        System.out.println(t.getName());

        //主线程输出5个hi,然后中断子线程休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);

        }
        System.out.println(t.getName()+"线程的优先级 ="+t.getPriority());
        //中断线程
        t.interrupt();//当执行interrupt ,就会中断 t线程的休眠.

    }
}
class T extends Thread {//自定义线程类
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中");
                Thread.sleep(20000);//10s
            } catch (InterruptedException e) {
                //InterruptedException 捕获到一个中断异常
                System.out.println(Thread.currentThread().getName() + "被Interrupt了");
            }
        }
    }


}
