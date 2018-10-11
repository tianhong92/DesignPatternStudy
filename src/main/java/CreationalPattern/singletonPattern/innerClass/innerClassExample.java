package CreationalPattern.singletonPattern.innerClass;

// 可以延迟加载， 只在显示调用getInstance方法时加载
public class innerClassExample {
    private static class SingletonHolder {
        private static final innerClassExample instance = new innerClassExample();
    }
    private innerClassExample(){};
    public static final innerClassExample getInstance(){
        return SingletonHolder.instance;
    }
}
