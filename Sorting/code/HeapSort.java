import java.util.Arrays;

public class HeapSort {

    static void heapSort(int[] a) {
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--) reheapDown(a, i, n);
        System.out.println("After build heap: " + Arrays.toString(a));

        for (int end = n - 1; end > 0; end--) {
            swap(a, 0, end);
            reheapDown(a, 0, end);
            System.out.println("After pass " + (n - end) + ":    " + Arrays.toString(a));
        }
    }

    static void reheapDown(int[] a, int i, int size) {
        while (2 * i + 1 < size) {
            int big = 2 * i + 1;
            if (big + 1 < size && a[big + 1] > a[big]) big++;
            if (a[i] >= a[big]) break;
            swap(a, i, big);
            i = big;
        }
    }

    static void swap(int[] a, int x, int y) {
        int t = a[x]; a[x] = a[y]; a[y] = t;
    }

    public static void main(String[] args) {
        int[] data = {4, 10, 3, 5, 1};
        System.out.println("Before sort:      " + Arrays.toString(data));
        heapSort(data);
        System.out.println("After sort:       " + Arrays.toString(data));
    }
}
