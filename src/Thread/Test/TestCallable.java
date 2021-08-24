package Thread.Test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @Author YixinWen
 * @Date 2021/8/24 1:25
 **/

//Callable 可以定义返回值   可以抛出异常
// 重写call方法
// 创建线程池 ExecutorService ser = Executors.newFixedThreadPool();
// 提交结果  Future<Boolean> r1 = ser.submit(t1);
// 获取结果    boolean rs1 = r1.get();
// 关闭线程     ser.shutdownNow();

public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }


    //下载图片执行体
    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为:" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://img1.baidu.com/it/u=419416486,1672361391&fm=26&fmt=auto&gp=0.jpg", "1.jpg");
        TestCallable t2 = new TestCallable("https://img1.baidu.com/it/u=419416486,1672361391&fm=26&fmt=auto&gp=1.jpg", "2.jpg");
        TestCallable t3 = new TestCallable("https://img1.baidu.com/it/u=419416486,1672361391&fm=26&fmt=auto&gp=2.jpg", "3.jpg");

        ExecutorService ser = Executors.newFixedThreadPool(3);


        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        boolean rs1 = r1.get();
        boolean rs2 = r1.get();
        boolean rs3 = r1.get();

        System.out.println(rs1);
        ser.shutdownNow();

    }


}

class WebDownloader {
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常,downloader方法异常");
        }
    }
}