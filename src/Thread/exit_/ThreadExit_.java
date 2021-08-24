package Thread.exit_;
/**
 * @Author YixinWen
 * @Date 2021/8/24 11:02
 * 线程终止
 **/
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();
        //希望main线程控制t1,终止,必须修改loop
        //让t1 退出run方法 ,从而终止t1线程 -->通知方式
        //让主线程休眠10秒,再通知 t1线程退出

        Thread.sleep(10*1000);

        t1.setLoop(false);
    }
}
class T extends Thread{
    int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 还在运行...."+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
