package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExample {

    public static void main(String[] args) {
        

        for(int i=1 ; i<=1000 ;i++){
        Thread t1 = Thread.ofVirtual().start(() -> System.out.println("i am virtual thread : "+ Thread.currentThread()));

        try {
            t1.join();
        } 
        catch (InterruptedException e) {

            throw new RuntimeException(e);



        }
        
    }

    for(int i=1 ; i<=100 ; i++){

       try(ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()){

            System.out.println("I am Virtual thread from Executor Service:"+Thread.currentThread());
       }
       catch(Exception e){
        throw  new RuntimeException(e);
       }
    }
}
    
}
