package singleton;

import java.util.List;

public class DemoMultiThread {

    public static void main(String[] args) {

        Thread threadJay = new Thread(new ThreadJay());
        Thread threadVeru = new Thread(new ThreadVeru());
        threadJay.start();
        threadVeru.start();
    }

    static class ThreadJay implements Runnable{

        @Override
        public void run() {
            NaiveSingleton obj1 = NaiveSingleton.getNaiveSingleton("jay");
            System.out.println(obj1.getValue());
        }
    }

    static class ThreadVeru implements Runnable{

        @Override
        public void run() {
            NaiveSingleton obj1 = NaiveSingleton.getNaiveSingleton("veru");
            System.out.println(obj1.getValue());
        }
    }

}
