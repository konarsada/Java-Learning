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
         * thread.join() ensures the main() thread waits for both to finish
         */
        System.out.println(c.count);
    }
}

/**
 * - New State
 * - Runnable State -> start() method
 * - Running State -> a thead is running with run() method
 * - Waiting State -> sleep(), wait() method
 * - Dead State
 * 
 * Through notify(), you will go to waiting state to runnable state.
 * From Running, Runnable state to dead state through stop() method.
 */