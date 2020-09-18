package ch19.generics;

public class SuperWildCardDemo {
    /**
     * use super wild card
     * ? extends T
     */

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        add(stack1, stack2);
    }

    /**
     * this method will add stack1 elements to stack2
     * it uses the super wild card to make sure of type compatibility between the stacks
     * so whatever stack1 data type will be, stack2 type should be compatible with it
     * @param stack1
     * @param stack2
     * @param <T>
     *
     * this method will also work if the header is modified to the following:
     * public static <T> void add(GenericStack<? extends T> stack1, GenericStack<T> stack2)
     */
    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
