package CreationalPattern.singletonPattern.lazyExample;

public class DoubleCheckSingleton {
    // 创建对象分为3步
    // 1. 分配内存空间
    // 2. 初始化对象
    // 3. 指针指向分配的对象空间
    // 因为存在重排序的可能， 所以要加volatile
    private volatile static DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){};
    public DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
