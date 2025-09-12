import java.util.Scanner;
import java.util.*;

// NTH Digit
public class DAY6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n Value :");
        int n = scan.nextInt();
        StringBuilder st = new StringBuilder();
        for(int i=1;i<=n;i++){
            st.append(i);

        }
        System.out.println(st.charAt(n-1));

    }
}

// Largest Number

class LargestNumber {
    public static void main(String[] args) {
        int nums[] = {10, 2};

        System.out.println(largest(nums));
    }

    public static String largest(int nums[]) {
        int n = nums.length;
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        java.util.Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder s = new StringBuilder();
        for (String c : arr) {
            s.append(c);
        }


        return s.toString();
    }
}


// Move all zero to the End

class MergeArray {
    public static int[] Zeros(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] + arr[i + 1];
                arr[i + 1] = 0;
            }
        }

        int index=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 2, 2, 0, 6, 6, 0, 8};
        int[] arr2 = {2, 2, 4, 0, 4, 4};

        System.out.println(Arrays.toString(Zeros(arr1)));
        System.out.println(Arrays.toString(Zeros(arr2)));
    }
}
