package Thread.syn;

/**
 * @Author YixinWen
 * @Date 2021/8/25 4:58
 * 使用多线程,模拟三个窗口同时售票 100张
 * 问题:hread方式 Runnable 都会超卖
 * 解决: synchronized 使用线程同步机制
 **/
public class SellTicket {
    public static void main(String[] args) {
//        SellTicketThread sellTicketThread01 = new SellTicketThread();
//        SellTicketThread sellTicketThread02 = new SellTicketThread();
//        SellTicketThread sellTicketThread03 = new SellTicketThread();
//
//        //票数超买
//        sellTicketThread01.start();
//        sellTicketThread02.start();
//        sellTicketThread03.start();

        SellTicketRunnableSynchronized sellTicketRunnableSynchronized = new SellTicketRunnableSynchronized(); //一个对象
        new Thread(sellTicketRunnableSynchronized).start();//第一个线程
        new Thread(sellTicketRunnableSynchronized).start();//第二个线程
        new Thread(sellTicketRunnableSynchronized).start();//第三个线程

    }
}
// 实现接口方式,使用synchronized
//同步方法锁 public synchronized  void m(){} ,锁在this对象.
//也可由在代码块上加锁
//**要求多个线程的锁的对象为同一个
class SellTicketRunnableSynchronized implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum
    private boolean loop = true; //控制run方法变量
    Object object = new Object();

    //同步方法(静态的)的锁为当前类本身
    //1.public synchronized static void m1(){} 锁是在 SellTicketRunnableSynchronized.class
    //2.如果在静态方法中,实现一个同步代码块 类名.class

    public synchronized static void m1(){

    }
    public static void m2(){
        synchronized (SellTicketRunnableSynchronized.class) {
            System.out.println("m2");
        }
    }



    public /*synchronized*/  void m() {
        //同步代码块
        synchronized (/*this*/ object) {

            if (ticketNum <= 0) {
                loop = false;
                System.out.println("售票结束");
                return;

            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("窗口  " + Thread.currentThread().getName() + "售出一张票" + "剩余票数=  " + (--ticketNum));
        }
    }

    @Override
    public void run() { //同步方法
       while (loop){
           m();
       }
    }
}


//Thread方式
class SellTicketThread extends Thread {
    private int ticketNum = 100;//让多个线程共享 ticketNum


    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口  " + Thread.currentThread().getName() + "售出一张票" + "剩余票数=  " + (--ticketNum));
        }
    }
}

// Runnable

class SellTicketRunnable implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum


    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口  " + Thread.currentThread().getName() + "售出一张票" + "剩余票数=  " + (--ticketNum));
        }
    }
}