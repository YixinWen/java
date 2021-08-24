package Thread.method;
/**
 * @Author YixinWen
 * @Date 2021/8/24 15:39
 * 线程礼让(yield)和插队(join)
 **/
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i <= 20; i++) {
            Thread.sleep(1000);//1s
            System.out.println("主线程吃了(小弟)" +i+ "包子");
            if (i == 5){
                System.out.println("主线程吃了(小弟) 让 子线程吃了(老大) 先吃");
                //join 线程插队
                t2.join();//让子线程插队.
                //yield 礼让不一定成功
//                Thread.yield();
                System.out.println("主线程 再吃");
            }
        }

    }
}
class T2 extends Thread{
    @Override
    public void run() {

        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);//1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程吃了(老大)" +i+ "包子");
        }
    }
}
