import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Input array size : ");
        int size = sc.nextInt();

        System.out.println("Search key : ");
        int key = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(100);
        }
        selectionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        binarySearch(arr, key);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        boolean found = false;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                System.out.println("Found " + key + " at the index " + mid);
                found = true;
                return;
            } else if (arr[mid] > key) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        if (!found) {
            System.out.println("Not found in the array");
        }
    }
}
