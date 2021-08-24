package Thread;

public class ThreadDome5  {
    public static void main(String[] args) {
        Dog dog = new Dog();
        new Thread(dog).start();
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();


    }
}
class  Tiger  implements Runnable{
    @Override
    public void run() {
        System.out.println("1");
    }
}

class ThreadProxy implements Runnable{

    private Runnable target = null;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }
    public void start(){
        start0();
    }

    private void start0() {
        run();
    }


}


class Dog implements Runnable{
    int sum = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("Hi-->"+(++sum)+"线程--->"+Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (sum == 10){
                break;
            }
        }
    }



}
