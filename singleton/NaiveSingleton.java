package singleton;

public class NaiveSingleton {
    private static NaiveSingleton instance;
    private String value;

    private NaiveSingleton(String value){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static NaiveSingleton getNaiveSingleton(String value){
        if(instance!=null){
            return instance;
        }
        synchronized (NaiveSingleton.class){
            if(instance==null){
                instance = new NaiveSingleton(value);
            }
            return instance;
        }

    }

    public String getValue() {
        return value;
    }
}
