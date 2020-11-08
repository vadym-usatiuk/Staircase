import java.util.Scanner;

public class Solution {

    private static void staircase(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            if (i > 1)
                System.out.print("\n");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        staircase(n);

        scanner.close();
    }
}
