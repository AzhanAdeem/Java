package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgo {
    public static int main(int[] args) {

        int[] arr = new int[5];
        Scanner scanObj = new Scanner(System.in);

        int itte = 0;
        while (itte < arr.length) {

            System.out.printf("Enter the elements of the array arr[]:");
            arr[itte] = scanObj.nextInt();
            itte++;
        }

        // ==================================== Selection sort:

        int n = arr.length;
        int i;
        for (i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
          
            // Swap the found minimum element with arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        // Selection Sort
        // selectionSort(arr);
        System.out.println("After Selection Sort: " + Arrays.toString(arr));

        // ======================= Bubble sort:
        // ===============================================
        n = arr.length;

        boolean swapped = false;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                } else if (!swapped) { // If no swaps in a pass, array is sorted
                    break;
                }
            }
        }

        // =======================================          Binary Sort

        int target;

        System.out.printf("Enter the value of the Target Value:");
        target = scanObj.nextInt();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // lowest index + ((Higher Index - lower Index) / 2);

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Element not found


    }
}