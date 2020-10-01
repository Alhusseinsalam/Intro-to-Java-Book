package ch23.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4,51,6,3,7,81,3,34,15};

        System.out.println("Sorting Desc");
        int[] newArray = bubbleSortDesc(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        System.out.println("Sorting Asc");
        int[] newArray2 = bubbleSortAsc(array);

        for (int i = 0; i < newArray2.length; i++) {
            System.out.println(newArray2[i]);
        }
    }

    public static int[] bubbleSortDesc(int[] originalArray) {
        boolean needNextPass = true;

        for (int i = 0; i < originalArray.length - 1 && needNextPass; i++) {
            // if no pass needed in a full swap then there is no need to proceed
            // because all elements are sorted
            needNextPass = false;

            for (int k = i + 1; k < originalArray.length; k++) {
                if (originalArray[i] < originalArray[k]) {
                    int tempElement = originalArray[k];
                    originalArray[k] = originalArray[i];
                    originalArray[i] = tempElement;

                    needNextPass = true;

                }
            }
        }
        return originalArray;
    }

    public static int[] bubbleSortAsc(int[] originalArray) {
        boolean needNextPass = true;

        for (int i = 1; i < originalArray.length && needNextPass; i++) {
            // if no pass needed in a full swap then there is no need to proceed
            // because all elements are sorted
            needNextPass = false;

            for (int k = 0; k < originalArray.length - i; k++) {
                if (originalArray[k] > originalArray[k + 1]) {
                    int tempElement = originalArray[k];
                    originalArray[k] = originalArray[k + 1];
                    originalArray[k + 1] = tempElement;

                    needNextPass = true;

                }
            }
        }
        return originalArray;
    }

}


