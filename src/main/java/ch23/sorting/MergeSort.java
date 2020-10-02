package ch23.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4,51,6,3,7,81,3,34,15};
        mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] originalArray) {
        if (originalArray.length > 1) {
            // separate the array and call mergeSort on each half
            int[] firstHalf = new int[originalArray.length/2];
            System.arraycopy(originalArray, 0, firstHalf, 0, originalArray.length / 2);
            mergeSort(firstHalf);

            int[] secondHalf = new int[originalArray.length - originalArray.length/2];
            System.arraycopy(originalArray, originalArray.length/2, secondHalf, 0, originalArray.length - originalArray.length/2);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, originalArray);
        }
    }

    public static void merge(int[] array1, int[] array2, int[] temp) {
        int currentItem1 = 0;
        int currentItem2 = 0;
        int currentItem3 = 0;

        while (currentItem1 < array1.length && currentItem2 < array2.length) {
            if (array1[currentItem1] > array2[currentItem2]) {
                temp[currentItem3] = array2[currentItem2];
                currentItem2++;
                currentItem3++;
            } else {
                temp[currentItem3] = array1[currentItem1];
                currentItem3++;
                currentItem1++;
            }
        }

        while (currentItem1 < array1.length) {
            temp[currentItem3] = array1[currentItem1];
            currentItem1++;
            currentItem3++;
        }

        while (currentItem2 < array2.length) {
            temp[currentItem3] = array2[currentItem2];
            currentItem2++;
            currentItem3++;
        }
    }

}
