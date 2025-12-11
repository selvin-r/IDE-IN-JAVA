package MyThread;

class ThreadDemo {

    static void main() {

//        System.out.printf(String.valueOf(t));
        System.out.println(Thread.currentThread().getName() + "Begins");
        Thread.currentThread().setPriority(9);

        //        MyThread t = new MyThread();
//
//        t.setName("First Thread");
//        t.start();
//
//        MyThread t1 = new MyThread();
//        t1.setName("\t\t\t Second Thread");
//        t1.start();


        Thread t1 = new Thread(new NewThread());
        t1.setName("First Thread");

        t1.start();


        Thread t2 = new Thread(new NewThread());
        t2.setName(" \t\t\t Second Thread");
        t2.start();

//        t1.start();
        System.out.println(Thread.currentThread().getName() + "END");
    }

}
/* Scheduler -> Scheduling Policy =>

 Forcible Deallocation of a resource form a thread is termed as preemption
 Non- premetion

 Thread - A piece of code which has its own path of execition


 Sequential Execution
 concurrent Execution -> Multi-Threaded
 Paralle Execution -> Multiple processore execution multiple threads



 */