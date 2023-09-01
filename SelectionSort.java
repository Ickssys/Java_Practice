public class SelectionSort {
    public static void swapElements(int[] arr, int i, int j) {
        // implement swap;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int smallestIndex(int[] arr, int r) {
        int smallest = r;
        for (int i = smallest + 1; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = i;
            }
        }
        return smallest;

    }

    public static void selectionSort(int[] arr) {
        // implement sort;
        for (int i = 0; i < arr.length; i++) {
            int j = smallestIndex(arr, i);
            swapElements(arr, i, j);
        }
    }

}
