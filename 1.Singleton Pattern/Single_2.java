//懒汉模式(线程不安全，不可用)
public class Singleton {
    private static Singleton instance = null;
    private Singleton() { }
    private static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}