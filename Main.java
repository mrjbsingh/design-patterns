import singleton.NaiveSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello design pattern ");
        NaiveSingleton obj1 = NaiveSingleton.getNaiveSingleton("jay");
        NaiveSingleton obj2 = NaiveSingleton.getNaiveSingleton("veru");

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
    }
}
