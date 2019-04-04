package threads;


//https://www.youtube.com/watch?v=_RSAS-gIjGo

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TimeoutThread {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Future<?> future = threadPool.submit(()->{
            while(!Thread.currentThread().isInterrupted()){

            }
        });

        future.cancel(true);
    }
}
