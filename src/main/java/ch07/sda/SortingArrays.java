package ch07.sda;

public class SortingArrays {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSortArray(list);

    }

    public static void selectionSortArray(double[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            int currentMinIndex = i;
            double currentMin = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
}
