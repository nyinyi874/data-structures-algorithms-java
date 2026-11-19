import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Input array size : ");
        int size = sc.nextInt();

        System.out.println("Input search key : ");
        int key = sc.nextInt();

        long start = System.nanoTime();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(100);
        }
        System.out.println("Generated Array : " + Arrays.toString(arr));

        boolean found = false;
        for (int j = 0; j < size; j++) {
            if (arr[j] == key) {
                System.out.println("Fount " + key + " at array index : " + j);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }

        long stop = System.nanoTime();

        System.out.println("Interval Time " + (stop - start));

    }
