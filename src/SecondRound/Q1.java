package SecondRound;

public class Q1 {
    static void main() {
        int n = 5;

        for (int i = 0; i <=n; i++) {

            // Left side numbers
            for (int j = n; j > i; j--) {
                System.out.print(j);
            }

            // Middle spaces
            for (int s = 0; s < i * 2 - 1; s++) {
                System.out.print(" ");
            }

            // Right side numbers
            if (i > 0) {
                for (int j = i + 1; j <= n; j++) {
                    System.out.print(j);
                }
            }

            System.out.println();

        }
    }

}