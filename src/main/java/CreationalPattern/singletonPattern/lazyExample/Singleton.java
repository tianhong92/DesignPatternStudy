package CreationalPattern.singletonPattern.lazyExample;

// 线程不安全
public class Singleton {
    private static Singleton instance;
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
