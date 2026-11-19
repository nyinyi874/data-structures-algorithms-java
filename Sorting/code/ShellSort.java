import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShellSort {
    public static void main(String args[]) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Array Size : ");
        int size = sc.nextInt();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = rnd.nextInt(100);
        }

        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(data));

        ShellSorter ss = new ShellSorter();
        ss.shellSort(data, size);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}

class ShellSorter {
    void shellSort(int array[], int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }
}
