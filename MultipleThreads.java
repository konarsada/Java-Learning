class A extends Thread {
    // public void show() {}
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    // public void show() {}
    /**
     * to run threads in paralle run() is necessary
     */
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) throws NumberFormatException {

        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

        /**
         * start() calls run
         */
        obj1.start();
        obj2.start();
    }

}