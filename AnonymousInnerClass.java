class A {
    public void show() {
        System.out.println("in A show");
    }
}

abstract class B {
    public abstract void show();

    public abstract void config();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("in A new show - overriding");
            }
        };

        obj.show();

        B obj2 = new B() {
            public void show() {
                System.out.println("in B show");
            }

            public void config() {
                System.out.println("in B config");
            }
        };

        obj2.config();
    }
}
