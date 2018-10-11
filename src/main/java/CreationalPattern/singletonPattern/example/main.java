package CreationalPattern.singletonPattern.example;

public class main {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
