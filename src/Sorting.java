public class Sorting {
    static void main() {

    }
}

//Merge Sort=====================================(28-10-2025)=========

class MergeSort {

    // Function to merge two halves
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;  // Size of left subarray
        int n2 = right - mid;     // Size of right subarray

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into arr[left..right]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Function to sort array using merge()
    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Main method
     static void main(String[] args) {
        int[] arr = {9,7,5,2,14,3};

        System.out.println("Original Array:");
        for (int num : arr) System.out.print(num + " ");

        sort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Array:");
        for (int num : arr) System.out.print(num + " ");
    }
}



