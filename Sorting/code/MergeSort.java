import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Input array size : ");
        int size = sc.nextInt();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rnd.nextInt(100);
        }
        System.out.println("Unsorted array : " + Arrays.toString(data));
        Object.MergeSort(data, 0, data.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(data));
    }

    class Object {
        static void MergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                MergeSort(arr, left, mid);
                MergeSort(arr, mid + 1, right);

                Merge(arr, left, mid, right);
            }

        }

        static void Merge(int[] arr, int left, int mid, int right) {
            int leftSize = (mid - left) + 1;
            int rightSize = (right - (mid + 1)) + 1;

            int L[] = new int[leftSize];
            for (int i = 0; i < leftSize; i++) {
                L[i] = arr[left + i];
            }

            int R[] = new int[rightSize];
            for (int j = 0; j < rightSize; j++) {
                R[j] = arr[(mid + 1) + j];
            }

            int i = 0, j = 0, k = left;
            while (i < leftSize && j < rightSize) {
                if (L[i] >= R[j]) {
                    arr[k] = R[j];
                    j++;
                } else {
                    arr[k] = L[i];
                    i++;
                }
                k++;
            }

            while (i < leftSize) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < rightSize) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
}
