package Thread.ticket;

/**
 * @Author YixinWen
 * @Date 2021/8/24 9:49
 * 使用多线程,模拟三个窗口同时售票 100张
 * 问题:hread方式 Runnable 都会超卖
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

        SellTicketRunnable sellTicketRunnable = new SellTicketRunnable(); //一个对象
        new Thread(sellTicketRunnable).start();//第一个线程
        new Thread(sellTicketRunnable).start();//第二个线程
        new Thread(sellTicketRunnable).start();//第三个线程

    }
}

//Thread方式
class SellTicketThread extends Thread {
    private static int ticketNum = 100;//让多个线程共享 ticketNum


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