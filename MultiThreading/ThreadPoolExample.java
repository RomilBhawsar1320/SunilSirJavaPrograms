package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    private String taskName;
    public Task(String taskName){
        this.taskName= taskName;
    }

    @Override
    public void run(){

        System.out.println("task:"+ taskName + "is running on :"+ Thread.currentThread().getName());

    }
}


public class ThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(6);

        for(int i =1; i<=50 ; i++){
            ex.submit(new Task("task"+i));
        }
        ex.shutdown();
    }
    
}
