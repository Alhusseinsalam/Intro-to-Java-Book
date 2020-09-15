package ch7.sda;

public class SearchingArrays {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,5,8,9,42,546,7777,77777757,777777775}, 3));
    }

    public static int linearSearch (int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) return i;
        }
        return -1;
    }

    public static int binarySearch (int[] list, int key) {
        // array here should be in ascending ordered
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (list[mid] == key) return mid;
            if (key < list[mid]) {
                high = mid -1;
            } else if (key > list[mid]) {
                low = mid + 1;
            }
        }
        /***
         * When the key is not found, low is the insertion point where a key would be inserted to
         * maintain the order of the list. It is more useful to return the insertion point than −1 . The method
         * must return a negative value to indicate that the key is not in the list.
         */
        return -low-1;
    }
}
