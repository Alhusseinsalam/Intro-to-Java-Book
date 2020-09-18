package ch18.recursion;

public class TailRecursion {
    /**
     * tail recursion is a recursion that uses auxiliary params
     * to not store data in the stack
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int n) {
        return factorial (n, 1);
    }

    public static long factorial(int n, int result) {
        /*
         * auxiliary factorial done in tail recursion
         *
         */
        if (n == 0) {
            return result;
        } else {
            return factorial(n-1, n * result);
        }
    }
}
