package Thread;
/**
 * @Author YixinWen
 * @Date 2021/8/23 1:49
 **/
//多线程操作同一个对象
//买火车票


//问题:多线程操作同一个资源,线程不安全,数据紊乱.
public class ThreadDemo4 implements Runnable {
    //票数
    private int tickctNums = 10;

    @Override
    public void run() {
        while (true)  {
            if (tickctNums<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+tickctNums--+"票");
        }
    }

    public static void main(String[] args) {
        ThreadDemo4 ticket = new ThreadDemo4();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"抢票1").start();
        new Thread(ticket,"黄牛党").start();

    }


}
