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
