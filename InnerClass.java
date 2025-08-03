class A {
    int age;
    static int staticVariableEx;

    static {
        staticVariableEx = 20;
    }

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }

    public static void d() {
        System.out.println("in static method D");
    }

    static class C {
        public void config() {
            System.out.println("in static inner class C");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C();
        obj2.config();

        A.d();

        System.out.println("before updating static variable " + A.staticVariableEx);

        A.staticVariableEx = 21;

        System.out.println("after updating static variable " + A.staticVariableEx);
    }
}
