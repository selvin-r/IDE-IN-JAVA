public class Chatgpt {
    public static  void main(String [] args){

    }
}

// Prefix sum =======================================================


class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        // Step 1: Create prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix array
        System.out.print("Prefix Sum Array: ");
        for (int p : prefix) {
            System.out.print(p + " ");
        }

        // Step 2: Use prefix sum to find range sum
        // Example: sum of elements from index 1 to 3 (4 + 6 + 8)
        int left = 1, right = 3;
        int rangeSum = prefix[right] - (left > 0 ? prefix[left - 1] : 0);
        System.out.println("\nSum from index " + left + " to " + right + " = " + rangeSum);
    }
}


class SumFormula {
    public static void main(String[] args) {
        int n = 8;
        int sum = n * (n + 1) / 2;
        for(int x=1;x<=n;x++){
            System.out.println("Sum of first " + n + " numbers = " + sum);
        }

    }
}

