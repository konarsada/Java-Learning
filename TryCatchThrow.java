public class TryCatchThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("I don't want to do print zero");
            }
        } catch (ArithmeticException e) {
            j = 18 / i;
            System.out.println("that is default output " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong. " + e);
        }

        System.out.println(j);
        System.out.println("Bye");

        /**
         * Custom exception
         */
        System.out.println();
        TryCatchThrow obj = new TryCatchThrow();
        obj.customException();
    }

    public void customException() {
        try {
            throw new NavinException("Calling custom exception 1 ");
        } catch (NavinException e) {
            System.out.println("Calling custom exception 2 " + e);
        }
    }
}

class NavinException extends Exception {
    NavinException(String str) {
        super(str);
    }
}