package unit1.day3;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopyDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
        }
        System.out.println("Original = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (value < arr[i]) {
                value = arr[i];
            }
        }
        arr = Arrays.copyOf (arr, arr.length + 1);
        arr[arr.length - 1] = value;
        System.out.println("Fixed = " + Arrays.toString(arr));
    }
}
