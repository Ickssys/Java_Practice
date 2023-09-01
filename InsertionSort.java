public class InsertionSort {
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int toInsert = a[i];
            int j = i - 1;
            while (j >= 0 && toInsert < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = toInsert;
        }
    }
}
