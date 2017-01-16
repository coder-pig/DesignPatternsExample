//枚举实现单例模式
public enum SingletonEnum {
    INSTANCE;
    private Singleton instance;
    SingletonEnum() { 
        instance = new Singleton()
    }
    public Singleton getInstance() {
        return instance;
    }
}