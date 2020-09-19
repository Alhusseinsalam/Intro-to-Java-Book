package ch23.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4,51,6,3,7,81,3,34,15};
        int[] newArray = sortAsc(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static int[] sortAsc(int[] originalArray) {
        for (int i = 1; i < originalArray.length; i++) {
            int currentMinElement = originalArray[i];
            int k;
            for (k = i - 1; k >= 0 && originalArray[k] > currentMinElement; k--) {
                originalArray[k+1] = originalArray[k];
            }
            originalArray[k+1] = currentMinElement;
        }
        return originalArray;
    }
}
