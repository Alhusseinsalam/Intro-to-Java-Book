package ch19.generics;

import java.util.ArrayList;

public class WildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-3);
        print(intStack);
    }

    /**
     * print the objects and empty the stack
     * take ? as a type parameter for the stack class
     * ? is a wild card
     */
    public static void print(GenericStack<?> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
