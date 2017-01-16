//使用容器实现单例模式
public class SingletonManager {
    private static Map<String,Object> objMap = new HashMap<String,Object>();
    private Singleton() { }
    public static void registerService(String key,Object instance) {
        if(!objMap.containsKey(key)) {
            objMap.put(key,instance);
        }
    }
    public static Object getService(String key) {
        return objMap.get(key);
    }
}