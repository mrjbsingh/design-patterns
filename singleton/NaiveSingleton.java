package singleton;

public class NaiveSingleton {
    private static NaiveSingleton instance;
    private String value;

    private NaiveSingleton(String value){
        this.value = value;
    }

    public static NaiveSingleton getNaiveSingleton(String value){
        if(instance==null){
            instance = new NaiveSingleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
