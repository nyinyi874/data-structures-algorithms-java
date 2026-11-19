public class ArrayOperations {

    static int insertAt(int[] a, int size, int pos, int value) {
        if (size == a.length || pos < 0 || pos > size)
            return size;
        for (int i = size; i > pos; i--)
            a[i] = a[i - 1];
        a[pos] = value;
        return size + 1;
    }

    static int deleteAt(int[] a, int size, int pos) {
        if (pos < 0 || pos >= size)
            return size;
        for (int i = pos; i < size - 1; i++)
            a[i] = a[i + 1];
        return size - 1;
    }

    static int linearSearch(int[] a, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    static int binarySearch(int[] a, int size, int key) {
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key)
                return mid;
            if (key < a[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static void reverse(int[] a, int size) {
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    static void print(int[] a, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int size = 0;
        for (int v : new int[] { 10, 20, 30, 40, 50 })
            size = insertAt(a, size, size, v);
        System.out.print("Original:        ");
        print(a, size);

        size = insertAt(a, size, 2, 25);
        System.out.print("Insert 25 at 2:  ");
        print(a, size);

        size = deleteAt(a, size, 0);
        System.out.print("Delete at 0:     ");
        print(a, size);

        System.out.println("Linear search 30: index " + linearSearch(a, size, 30));
        System.out.println("Binary search 40: index " + binarySearch(a, size, 40));

        reverse(a, size);
        System.out.print("Reversed:        ");
        print(a, size);
    }
}
