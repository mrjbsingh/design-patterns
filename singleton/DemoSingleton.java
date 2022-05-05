package singleton;

public class DemoSingleton {
    public static void main(String[] args) {

        NaiveSingleton obj1 = NaiveSingleton.getNaiveSingleton("jay");
        NaiveSingleton obj2 = NaiveSingleton.getNaiveSingleton("veru");

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
    }
}
