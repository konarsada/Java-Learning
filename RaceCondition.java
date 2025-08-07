class Counter {
    int count;

    /**
     * synchronized ensures both t1 and t2
     * will not use increment() at the same time
     */
    // public void increment()
    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        /**
         * thread.join() ensures
         * next line will execute only affter thread has finished executing
         */
        System.out.println(c.count);
    }
}
