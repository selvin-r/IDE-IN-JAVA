package MyThread;

public class NewThread implements Runnable{

    @Override
    public void run(){


        for (int j=1;j<=5;j++){
            System.out.printf(Thread.currentThread().getName());
        }
    }

}
