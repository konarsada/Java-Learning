class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        // super();
        super(5);
        System.out.println("in B");
    }

    public B(int n) {
        // super(); //call default constructor of super class
        // this(); //call constructor of same class
        super(n);
        System.out.println("in B int");
    }
}

public class Hello {
    public static void main(String[] args) {

        B obj = new B();
        // B obj=new B(5);
    }
}