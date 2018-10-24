package BehavioralPattern.IteratorPattern;

// 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Lora", "Julie"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
