package observer;

/**
 * Created by Administrator on 2017/3/7 0007.
 */


public class Client {
    public static void main(String[] args) {
        CoderPig coderPig = new CoderPig();
        AndroidDev dev = new AndroidDev();
        coderPig.addObserver(dev);
        coderPig.update("Java中对观察者模式的支持~");
        coderPig.deleteObserver(dev);
    }
}
