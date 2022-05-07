package singleton;

import java.util.ArrayList;
import java.util.List;

public class DemoMultiThread {

    public static void main(String[] args) {


        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=1; i<=10; i++){
            threads.add(new Thread(new ThreadWithName("jay "+i)));
        }
        for ( Thread thread: threads ) {
            thread.start();
        }

    }

    static class ThreadWithName implements Runnable{
        private String threadName;
        public ThreadWithName(String threadName){
            this.threadName = threadName;
        }
        @Override
        public void run() {
            NaiveSingleton obj1 = NaiveSingleton.getNaiveSingleton(this.threadName);
            System.out.println(obj1.getValue());
        }
    }

}
