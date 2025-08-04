@FunctionalInterface
interface A {
    // functional interface is interface with only one method
    // void show();
    void show(int i);

}

public class Lambda {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void show(int i) {
        // System.out.println("in show" + i);
        // }
        // };
        // obj.show(5);

        // lambda expressions works with functional interfaces only
        // A obj = () -> System.out.println("in Show");
        // obj.show();

        A obj = i -> System.out.println("in show " + i);
        obj.show(5);

        // when we need to return something
        // A obj = (i,j) -> i + j;
    }
}
