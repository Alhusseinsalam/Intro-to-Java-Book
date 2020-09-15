package ch18.recursion;

public class RecursionCases {
    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(getFibonacciNumByIndex(13));
//
//        System.out.println(isPalindrome("dad"));
//        System.out.println(isPalindrome("mom"));
//        System.out.println(isPalindrome("mama"));
//
//        System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,5,6,7,8,9,10}, 5));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static long getFibonacciNumByIndex(int index) {
        if (index == 0) return 0;
        else if (index == 1) return 1;
        else return getFibonacciNumByIndex(index - 1) + getFibonacciNumByIndex(index - 2);

    }
/*
    // without using recursive helper method
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        else if (str.charAt(0) != str.charAt(str.length()-1)) return false;
        else return isPalindrome(str.substring(1, str.length()-1));
    }
*/


    // using recursive helper method
    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length()-1);
    }

    // the recursive helper method
    public static boolean isPalindrome(String str, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex) return true;
        else if (str.charAt(lowIndex) != str.charAt(highIndex)) return false;
        else return isPalindrome(str, lowIndex + 1, highIndex - 1);
    }


    public static void recursiveSelectionSort(double[] list) {
        recursiveSelectionSort(list, 0, list.length - 1);
    }

    public static void recursiveSelectionSort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];

            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            list[indexOfMin] = list[low];
            list[low] = min;
            recursiveSelectionSort(list, low+1, high);
        }
    }

    public static int recursiveBinarySearch(int[] list, int key) {
        return recursiveBinarySearch(list, 0, list.length - 1, key);
    }

    public static int recursiveBinarySearch(int[] list, int lowIndex, int highIndex, int key) {
        if (lowIndex > highIndex) return -lowIndex-1;
        int mid = (lowIndex + highIndex) / 2;
        if (key == list[mid]) {
            return mid;
        } else if (key > list[mid]) {
            lowIndex = mid + 1;
        } else if (key < list[mid]) {
            highIndex = mid - 1;
        }
        return recursiveBinarySearch(list, lowIndex, highIndex, key);
    }

}
