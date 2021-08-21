package Thread;

/*
1.写下载器,下载方法
2.继承线程类
3.创建构造器
4.重写run()方法
 */
/**
 * @Author YixinWen
 * @Date 2021/8/22 6:11
 **/


import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread ,实现多线程下载器
public class ThreadDemo2 implements Runnable {
    private String url;
    private String name;

    public ThreadDemo2(String url, String name) {
        this.url = url;
        this.name = name;
    }



    //下载图片执行体
    @Override
    public void run() {
        this.url = url;
        this.name = name;
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为:" + name);
    }

    public static void main(String[] args) {
        ThreadDemo2 t1 = new ThreadDemo2("https://img1.baidu.com/it/u=419416486,1672361391&fm=26&fmt=auto&gp=0.jpg", "1.jpg");
        ThreadDemo2 t2 = new ThreadDemo2("https://img1.baidu.com/it/u=419416486,1672361391&fm=26&fmt=auto&gp=1.jpg", "2.jpg");
        ThreadDemo2 t3 = new ThreadDemo2("https://img1.baidu.com/it/u=419416486,1672361391&fm=26&fmt=auto&gp=2.jpg", "3.jpg");
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }


}



//下载器
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