package MultiThreading;

class Mythread extends Thread{
    @Override
    public void run(){
        for(int i =1 ; i<=50 ; i++){
            if(i%2==0){
                System.out.println("Even Number :" + i);
            }
        }
    }
}

class ImplementedThread implements Runnable{
    
    @Override
    public void run(){
        for(int i =0 ; i<=50 ; i++){
            if(i%2 != 0){
                System.out.println("odd number :"+i);

            }
        }
    }
}




public class ThreadCreation {

    public static void main(String[] args) {

        Mythread t1 = new Mythread();
        Thread t2 = new Thread(new ImplementedThread());
        t1.start();
        t2.start();
        
    }
    
}
