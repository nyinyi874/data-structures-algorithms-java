import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size : ");
        int size = sc.nextInt();

        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rnd.nextInt(100);
        }
        System.out.println("Unsorted Array " + Arrays.toString(data));

        ob.quickSort(data, 0, size - 1);
        System.out.println("Sorted Array " + Arrays.toString(data));
    }
}

class ob {
    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }
}
