package Thread.method;
/**
 * @Author YixinWen
 * @Date 2021/8/24 16:25
 * 守护线程 setDaemon(true)
 **/
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //先设置在启动线程
        myDaemonThread.setDaemon(true);
        //如果我们希望主线程结束后,子线程自动结束
        //只需将子线程设置为守护线程即可
        myDaemonThread.start();


        for (int i = 0; i <= 10; i++) { //main线程
            System.out.println("工作中...."+ i);
            Thread.sleep(1000);//1s

        }
    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("聊天中");
        }
    }
}