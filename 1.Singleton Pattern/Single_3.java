//懒汉模式(线程安全，但效率低，不推荐使用)
public class Singleton { 
    private Singleton instance = null;
    private Singleton() { }
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}