package CreationalPattern.singletonPattern.hungryExample;

public class HungryExample {
    private static HungryExample instance = new HungryExample();
    private HungryExample(){}
    public HungryExample getInstance(){
        return instance;
    }
}
