
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */
public class RearrangeArray {

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            // Find the first positive number from the left
            while (i < n && arr[i] < 0) {
                i++;
            }

            // Find the first negative number from the right
            while (j >= 0 && arr[j] >= 0) {
                j--;
            }

            // Swap the positive and negative numbers
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        System.out.println("Input Array: " + Arrays.toString(inputArray));

        rearrangeArray(inputArray);

        System.out.println("After rearranging: " + Arrays.toString(inputArray));
    }
}

