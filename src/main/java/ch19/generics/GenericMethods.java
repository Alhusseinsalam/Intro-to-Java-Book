package ch19.generics;

import java.util.ArrayList;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,6};
        String[] strs = {"Hello", "World"};

        print(ints);
        print(strs);
    }

    /**
     * this is a generic method
     */

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
